/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processing;
//PROVIDER FOR CENSUS
/**
 *
 * @author deeps
 */
public interface Provider {  
String DRIVER="com.mysql.jdbc.Driver";  
String CONNECTION_URL="jdbc:mysql://localhost:3306/census?autoReconnect=true&useSSL=false";  
String USERNAME="root";  
String PASSWORD="redhat";  
  
} 