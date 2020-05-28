package com.exam.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class MysqlConnectionTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/goott7?useSSL=false";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	
	@Test
	public void testConn() throws ClassNotFoundException {
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)){
			System.out.println("conn : " + conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
