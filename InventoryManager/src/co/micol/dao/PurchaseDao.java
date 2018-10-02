package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.bean.PurchaseBean;


public class PurchaseDao {
	private Connection conn;
	private String sql;
	private PreparedStatement psmt;
	private ResultSet rs;
	private ResultSet rs1;
	
	
	public PurchaseDao() {  //생성자
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
	public ResultSet insertPurchase(PurchaseBean b) throws SQLException{ //내용 삽입하기
		sql = "insert into purchase(bcode, bname, baddr, bnumber, brepresent) "
				+ "values(?,?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs1 = psmt.executeQuery();
			psmt.setString(1, b.getBcode());
			psmt.setString(2, b.getBname());
			psmt.setString(3, b.getBaddr());
			psmt.setInt(4, b.getBnumber());
			psmt.setString(5, b.getBrepresent());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs1;
	}
	public void close1() throws SQLException { 
		psmt.close();
		conn.close();
	}
	
	
	
	//psmt.setString(1, b.getTitle());
	
	
	
//	public ResultSet userView() throws SQLException{ //select
//		sql = "select * from purchase";
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return rs;
//	}
//	public void close() throws SQLException { //객체닫음
//		psmt.close();
//		conn.close();
//	}
		
	
}
