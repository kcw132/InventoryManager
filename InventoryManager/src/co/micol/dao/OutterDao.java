package co.micol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.bean.OutterBean;
import co.micol.bean.SaleBean;

public class OutterDao {
	private Connection conn;
	private String sql;
	private PreparedStatement psmt;
	private ResultSet rs;


	public OutterDao() { // 생성자
		try {
			String user = "micol";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@192.168.0.25:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet saleView() throws SQLException { // 조회
		sql = "select * from sale";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
		}

		catch (SQLException e) {
			e.printStackTrace();
//		} finally {
//			close();
		}
		return rs;
	}

	public int insertoutter(OutterBean b) throws SQLException { // 내용 삽입하기
		sql = "insert into sale(pannum, lnum, pcode, pname, outamount, price, tprice, outdate, pancom) " + "values('p'||to_char(sysdate,'yyyymm')||,?,?,?,?,?,?,to_char(sysdate,'yyyymmdd'),?)";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, b.getLnum());
			psmt.setString(2, b.getPcode());
			psmt.setString(3, b.getPname());
			psmt.setInt(4, b.getOutamount());
			psmt.setInt(5, b.getPrice());
			psmt.setInt(6, b.getTprice());
			psmt.setString(7, b.getPancom());
			r = psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}

//		finally {
//			close();
//		}
		return r;

	}

	public ResultSet deletesale(String scode) throws SQLException { // 삭제
		sql = "delete from sale where scode = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, scode);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		finally {
//			close();
//		}
		return rs;

	}

	public ResultSet editsale(SaleBean d) throws SQLException { // 수정
		sql = "update sale set sname = ?, saddr = ?," + "snumber = ?, srepresent =? where scode = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, d.getSname());
			psmt.setString(2, d.getSaddr());
			psmt.setInt(3, d.getSnumber());
			psmt.setString(4, d.getSrepresent());
			psmt.setString(5, d.getScode());
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
//		} finally {
//			close();
//		}
		}
		return rs;
	}

	public void close() throws SQLException { // 객체닫음
		psmt.close();
		conn.close();
		rs.close();
	}

}
