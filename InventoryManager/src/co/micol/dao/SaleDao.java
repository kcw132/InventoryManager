package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SaleDao {
	private Connection conn;
	
	
	public SaleDao() {  //생성자
		try {
			String user = "micol";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
