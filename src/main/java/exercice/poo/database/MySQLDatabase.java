package exercice.poo.database;

import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

@Slf4j
@SuperBuilder

public class MySQLDatabase extends Database {

    public void printDatabaseInfo() {
        if (connection == null) {
            log.warn("Aucune connexion active");
            return;
        }

        try {
            DatabaseMetaData meta = getConnection().getMetaData();
            log.info("Nom du driver : {}", meta.getDriverName());
            log.info("URL de la base : {}", meta.getURL());
            log.info("Utilisateur connecté : {}", meta.getUserName());
        } catch (SQLException e) {
            log.error("Erreur lors de la récupération des infos de la base : {}", e.getMessage());
        }
    }
}
