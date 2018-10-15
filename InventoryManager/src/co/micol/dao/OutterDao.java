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
	private int r;


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

	public ResultSet outterView() throws SQLException { // 조회
		sql = "select * from outter";
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
		sql = "insert into outter(pannum, lnum, pcode, pname, outamount, price, tprice, pancom, outdate) " + 
	"values('s'||to_char(sysdate,'yyyymm')||lpad(s_seq.nextval,3,0),?,?,?,?,?,?,?, to_char(sysdate,'yyyymmdd'))";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
	//		psmt.setString(1, b.getPannum());
			psmt.setInt(1, b.getLnum());
			psmt.setString(2, b.getPcode());
			psmt.setString(3, b.getPname());
			psmt.setInt(4, b.getOutamount());
			psmt.setInt(5, b.getPrice());
			psmt.setInt(6, b.getTprice());
			psmt.setString(7, b.getPancom());
	//		psmt.setString(9, b.getOutdate());
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

	public ResultSet deleteoutter(String pannum) throws SQLException { // 삭제
		sql = "delete from outter where pannum = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pannum);
			rs = psmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		finally {
//			close();
//		}
		return rs;

	}

	public ResultSet editoutter(OutterBean d) throws SQLException { // 수정
		sql = "update outter set  lnum= ?, pcode = ?, pname = ?, outamount = ?, price =?, tprice = ?,pancom = ? where pannum = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, d.getLnum());
			psmt.setString(2, d.getPcode());
			psmt.setString(3, d.getPname());
			psmt.setInt(4, d.getOutamount());
			psmt.setInt(5, d.getPrice());
			psmt.setInt(6, d.getTprice());
			psmt.setString(7, d.getPancom());
			psmt.setString(8, d.getPannum());
			r = psmt.executeUpdate();
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
