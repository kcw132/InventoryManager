package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import co.micol.bean.WareinfoBean;
import co.micol.dao.WareinfoDao;

public class WareinfoModel {
	private ResultSet rs;

	private WareinfoDao wd = new WareinfoDao();
	private WareinfoBean wb = new WareinfoBean();
	private Scanner scq = new Scanner(System.in);

	public ResultSet WareinfoView() throws SQLException {
		rs = wd.getDataWareinfo();
		while (rs.next()) {
			wb = new WareinfoBean();
			wb.setWcode(rs.getString("wcode"));
			wb.setWname(rs.getString("wname"));
			wb.setWinfo(rs.getString("winfo"));
		

			wb.toppp();
		}
		return rs;
	}

	public void WareinfoInsert() throws SQLException {
		System.out.println("창고코드를 입력하세요.");
		wb.setWcode(scq.nextLine());
		System.out.println("창고이름을 입력하세요.");
		wb.setWname(scq.nextLine());
		System.out.println("창고정보를 입력하세요.");
		wb.setWinfo(scq.nextLine());
		rs = wd.insertDataWareinfo(wb);

		if (rs.next()) {
			System.out.println("창고가 입력되었습니다.");
		} else {
			System.out.println("창고정보 입력을 실패하였습니다.");
		}
	}
	
	public void WareinfoUpdate() throws SQLException {
		System.out.println("변경할 창고의 창고코드를 입력하세요.");
		wb.setWcode(scq.nextLine());
		System.out.println("창고명을 입력하세요.");
		wb.setWname(scq.nextLine());
		System.out.println("창고정보를 입력하세요");
		wb.setWinfo(scq.nextLine());
		
		
		rs = wd.updateDataWareinfo(wb);
		
		if(rs.next()) {
			System.out.println("창고정보가 변경되었습니다.");
		}
		else {
			System.out.println("창고정보 변경을 실패하였습니다.");
		}
	}
	
}
