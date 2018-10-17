package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import co.micol.bean.OutterBean;
import co.micol.bean.SaleBean;
import co.micol.dao.OutterDao;
import co.micol.dao.SaleDao;

public class OutterModel {

	private OutterBean bean = new OutterBean();
	private OutterDao dao = new OutterDao();
	private ResultSet rs;
	private String scode;
	private String sname;
	private String saddr;
	private String snumber;
	private String srepresent;
	



	public void outterView() throws SQLException { // 조회
		rs = dao.outterView();
		if (rs.next()) {
			do {
				bean = new OutterBean();
				bean.setPannum(rs.getString("pannum"));
				bean.setLnum(rs.getInt("lnum"));
				bean.setPcode(rs.getString("pcode"));
				bean.setPname(rs.getString("pname"));
				bean.setOutamount(rs.getInt("outamount"));
				bean.setPrice(rs.getInt("price"));
				bean.setTprice(rs.getInt("tprice"));
				bean.setOutdate(rs.getString("outdate"));
				bean.setPancom(rs.getString("pancom"));
				bean.toString();
			} while (rs.next());
		} else
			System.out.println("게시글이 존재하지 않습니다.");

	}

	public void insertoutter() throws SQLException { // 입력

		Scanner sc = new Scanner(System.in);
//		System.out.println("구매처의 출고번호를 입력하세요.");
//		bean.setPannum(sc.nextLine());
		
		System.out.println("구매처의 품목코드를 입력하세요.");
		bean.setPcode(sc.nextLine());
		System.out.println("구매처의 품목명을 입력하세요.");
		bean.setPname(sc.nextLine());
		System.out.println("구매처의 수량을 입력하세요.");
		bean.setOutamount(sc.nextInt());
		sc.nextLine();
		System.out.println("구매처의 판매가를 입력하세요.");
		bean.setPrice(sc.nextInt());
		sc.nextLine();
		
		dao.insertoutter(bean);

//		if (r>0) {
//			System.out.println("사용자를 입력하였습니다.");
//		} else
//			System.out.println("사용자 수정 실패");
//
}
	
	
	
	

	public void deleteoutter() throws SQLException { // 사용자 삭제
		outterView();
		Scanner sc = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("삭제할 사용자 ID를 입력하세요");
		rs = dao.deleteoutter(sc.next());

		if (rs.next()) {
			System.out.println("사용자를 삭제하였습니다.");
		} else
			System.out.println("사용자 삭제 실패");

	}


}