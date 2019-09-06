/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Cristobal
 */
public class conexion {
    public static PreparedStatement prest;
    public static CallableStatement cllst;
    public static Connection conec;
    public static Statement st;
    public static ResultSet rt;
    public static String db;
    public static String rut_user;
    
    Connection conectar;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/bdbanco","root","");
            //System.out.println("Bien");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Mal");
        } 
        return conectar;
    }

    

    

    

    

    

    
}