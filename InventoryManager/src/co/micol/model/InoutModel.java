package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.bean.InoutBean;
import co.micol.dao.InoutDao;

public class InoutModel {
	private InoutDao id = new InoutDao();
	private InoutBean ib = new InoutBean();
	private ResultSet rs;
	private int result;
	
	public ResultSet InoutShow() throws SQLException {
		rs = id.getDataInout();
		while(rs.next()) {
			ib = new InoutBean();
			
			ib.setPcode(rs.getString("pcode"));
			ib.setPname(rs.getString("pname"));
			ib.setGoocount(rs.getString("goocount"));
			ib.setPancount(rs.getString("pancount"));
			ib.setIodate(rs.getString("iodate"));
			
			ib.toString();
		}
		
		return rs;
	}
}
