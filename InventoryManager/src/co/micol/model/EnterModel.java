package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import co.micol.bean.EnterBean;
import co.micol.dao.EnterDao;

public class EnterModel {
	private EnterDao ed = new EnterDao();
	private EnterBean eb = new EnterBean();
	private Scanner sce = new Scanner(System.in);
	private ResultSet rs;
	
	public ResultSet EnterShow() throws SQLException {
		rs = ed.getDataEnter();
		while(rs.next()) {
			eb = new EnterBean();
			eb.setGoonum(rs.getString("goonum"));
			eb.setLnum(rs.getInt("lnum"));
			eb.setPcode(rs.getString("pcode"));
			eb.setPname(rs.getString("pname"));
			eb.setInamount(rs.getInt("inamount"));
			eb.setPrice(rs.getInt("price"));
			eb.setTprice(rs.getInt("tprice"));
			eb.setEnterdate(rs.getString("enterdate"));
			eb.setEntercom(rs.getString("entercom"));
			
			eb.toString();
		}
		return rs;
	}
}
