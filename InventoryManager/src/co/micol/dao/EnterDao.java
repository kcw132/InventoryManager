package co.micol.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.bean.EnterBean;

public class EnterDao {
	private Connection conn;
	private String sql;
	private static String proc;
	private PreparedStatement psmt;
	private CallableStatement csmt;
	private ResultSet rs;
	
	public EnterDao() {
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
	public ResultSet getDataEnter() {
		sql = "select * from enter";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return rs;
	}
	
	public ResultSet insertDataEnter(EnterBean eb) throws SQLException {
		proc = "{call p_insert(?,?,?,?)}";
		try {
			csmt = conn.prepareCall(proc);
			csmt.setString(1, eb.getPcode());
			csmt.setString(2, eb.getPname());
			csmt.setInt(3, eb.getInamount());
			csmt.setInt(4, eb.getPrice());
			csmt.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return rs;
		
	}

}
