/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDB {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String root = "root";
    private static String senha = "060605";
    private static String db = "MyBank_Andrey";
    
    public static Connection conectar() throws Exception{
        String url = String.format("jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC",host,porta,db);
        return DriverManager.getConnection(url,root,senha);
    }
    
}
