package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import co.micol.bean.WareinfoBean;

public class WareinfoDao {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String sql;

	public WareinfoDao() {
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

	public ResultSet getDataWareinfo() throws SQLException {
		sql = "select * from Wareinfo";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet insertDataWareinfo(WareinfoBean wb) throws SQLException {
		sql = "insert into wareinfo values(?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, wb.getWcode());
			psmt.setString(2, wb.getWname());
			psmt.setString(3, wb.getWinfo());

			rs = psmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public ResultSet updateDataWareinfo(WareinfoBean wb) throws SQLException {
		sql = "update product set wname = ?, winfo = ? where wcode = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(3, wb.getWcode());
			psmt.setString(1, wb.getWname());
			psmt.setString(2, wb.getWinfo());

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
