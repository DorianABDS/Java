package exercice.poo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@SuperBuilder
@Slf4j
public abstract class Database {

    private final String url;
    private final String user;
    private final String password;

    protected Connection connection;

    public void connect() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            log.info("Connexion réussie.");
        } catch (SQLException e) {
            log.error("Erreur lors de la connexion : {}", e.getMessage());
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                log.info("Déconnexion réussie.");
            }
        } catch (SQLException e) {
            log.error("Erreur lors de la déconnexion : {}", e.getMessage());
        }
    }
}
