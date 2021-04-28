package com.litholr.chord;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MariaConnectionTest {
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	
	private static final String URL = "jdbc:mariadb://localhost:3306/chorddb";//?user=chordadmin&password=1234"
	
	private static final String USER = "chordadmin";
	private static final String PW = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try (Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
