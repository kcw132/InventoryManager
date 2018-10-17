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
			
			eb.setLnum(rs.getInt("lnum"));
			eb.setPcode(rs.getString("pcode"));
			eb.setPname(rs.getString("pname"));
			eb.setInamount(rs.getInt("inamount"));
			eb.setPrice(rs.getInt("price"));
			eb.setTprice(rs.getInt("tprice"));
			eb.setEnterdate(rs.getString("enterdate"));
			
			
			eb.toString();
		}
		return rs;
	}
	
	public void EnterInsert() throws SQLException {
		rs = null;
		System.out.println("상품코드를 입력하세요.");
		eb.setPcode(sce.nextLine());
		System.out.println("상품명을 입력하세요.");
		eb.setPname(sce.nextLine());
		System.out.println("수량을 입력하세요.");
		eb.setInamount(sce.nextInt());
		sce.nextLine();
		System.out.println("가격을 입력하세요.");
		eb.setPrice(sce.nextInt());
		sce.nextLine();
		ed.insertDataEnter(eb);
		
	}
	public void EnterDelete() throws SQLException {
		rs = null;
		EnterShow();
		System.out.println("삭제할 구매내역의 구매번호를 입력하세요.");
		
	}
}
