package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InventoryDao {
	private Connection conn;
	private String sql;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void InoutDao() {
		try {
			String url = "jdbc:oracle:thin:@192.168.0.25:1521:xe";
			String user = "micol";
			String pw = "1234";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ResultSet getDataInventory() {
		sql = "select * from inventory";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
		
	}
}
