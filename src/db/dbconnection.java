/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author mti
 */
import java.sql.*;

public class dbconnection
{
	static Connection con;
	public static Connection getConnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/telephone_register","root","");
                        System.out.println("connected run");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}