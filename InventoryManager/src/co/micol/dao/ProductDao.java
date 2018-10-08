package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.bean.ProductBean;

public class ProductDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String sql;

	public ProductDao() {
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

	public ResultSet getDataProduct() throws SQLException {
		sql = "select * from product";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return rs;
	}

	public ResultSet insertDataProduct(ProductBean pb) throws SQLException {
		sql = "insert into product values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pb.getCcode());
			psmt.setString(2, pb.getPcode());
			psmt.setString(3, pb.getPname());
			psmt.setString(4, pb.getStan());
			psmt.setString(5, pb.getUnit());
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return rs;
	}

	public ResultSet updateDataProduct(ProductBean pb) throws SQLException {
		sql = "update product set pname = ?, stan = ?, unit = ? where pcode = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(4, pb.getPcode());
			psmt.setString(1, pb.getPname());
			psmt.setString(2, pb.getStan());
			psmt.setString(3, pb.getUnit());

			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	
	public void close() throws SQLException {
		psmt.close();
		conn.close();
	
	}
}
