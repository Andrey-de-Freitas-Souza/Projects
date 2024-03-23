package telas;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String root = "root";
    private static String senha = "060605";
    private static String db = "MyBanK";
    
    public static Connection conectar() throws Exception{
        String url = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",host,porta,db);
        return DriverManager.getConnection(url,root,senha);
    }
    
}
