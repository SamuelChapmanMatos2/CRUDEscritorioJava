/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author DELL
 */
public class Conexion {
        Connection con;
        public Conexion(){
            try{
                //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro?SslMode=none","root","");
            }catch(Exception e){
                
            }
        }
        
        public Connection getConnection(){
            return con;
        }
}
