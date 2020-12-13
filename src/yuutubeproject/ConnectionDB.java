package yuutubeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionDB {
    
    public static Connection dbConnection() {
        Connection connection = null;
        String url = "jdbc:postgresql://localhost:5432/yuutubedb";
        String user = "postgres";
        String password = "danielwan";
        
        try {
        Class.forName("org.postgresql.Driver");
        } catch(ClassNotFoundException e) {
            e.getMessage();
        }
        
        try {
            connection = DriverManager.getConnection(url, user, password);        
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed to connect");
        }
        
        return connection;
    }
}
