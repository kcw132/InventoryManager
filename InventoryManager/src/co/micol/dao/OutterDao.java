package co.micol.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import co.micol.bean.OutterBean;

public class OutterDao {
	private Connection conn;
	private String sql;
	private String proc;
	private PreparedStatement psmt;
	private CallableStatement csmt;
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

	public ResultSet insertoutter(OutterBean b)   { // 내용 삽입하기
		CallableStatement csmt;
		String proc = "{call s_outter(?,?,?,?,?)}";
		try {
			csmt = conn.prepareCall(proc);
			csmt.setString(1, b.getPcode());
			csmt.setString(2, b.getPname());
			csmt.setInt(3, b.getOutamount());
			csmt.setInt(4, b.getPrice());
			csmt.registerOutParameter(5, Types.VARCHAR);
			csmt.execute();
			String grade = csmt.getString(5);
			System.out.println(grade);
		} catch (SQLException e) {
			
				
				e.printStackTrace();

		}
			return rs;
//		finally {
//			close();
//		}
		

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

	

	public void close() throws SQLException { // 객체닫음
		psmt.close();
		conn.close();
		rs.close();
	}

}
