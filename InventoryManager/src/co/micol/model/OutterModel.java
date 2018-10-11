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
	



	public void saleView() throws SQLException { // 조회
		rs = dao.saleView();
		if (rs.next()) {
			do {
				bean = new SaleBean();
				bean.setScode(rs.getString("scode"));
				bean.setSname(rs.getString("sname"));
				bean.setSaddr(rs.getString("saddr"));
				bean.setSnumber(rs.getInt("snumber"));
				bean.setSrepresent(rs.getString("srepresent"));
				bean.toString();
			} while (rs.next());dddd
		} else
			System.out.println("게시글이 존재하지 않습니다.");

	}

	public void insertoutter() throws SQLException { // 입력

		Scanner sc = new Scanner(System.in);
		System.out.println("구매처의 라인번호를 입력하세요.");
		bean.setLnum(sc.nextInt());
		sc.nextLine();
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
		System.out.println("구매처의 금액를 입력하세요.");
		bean.setTprice(sc.nextInt());
		sc.nextLine();
		System.out.println("구매처의 판매처를 입력하세요.");
		bean.setPancom(sc.nextLine());
		
		int r = dao.insertoutter(bean);

		if (r>0) {
			System.out.println("사용자를 입력하였습니다.");
		} else
			System.out.println("사용자 수정 실패");

	}

	public void deletesale() throws SQLException { // 사용자 삭제
		saleView();
		Scanner sc = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("삭제할 사용자 ID를 입력하세요");
		rs = dao.deletesale(sc.next());

		if (rs.next()) {
			System.out.println("사용자를 삭제하였습니다.");
		} else
			System.out.println("사용자 삭제 실패");

	}

	public void editsale() throws SQLException { // 사용자 수정
		Scanner sc = new Scanner(System.in);
		saleView();
		System.out.println("======================");
		System.out.println("구매처의 코드를 선력하세요");
		bean.setScode(sc.nextLine());
		System.out.println("구매처의 이름을 입력하세요");
		bean.setSname(sc.nextLine());
		System.out.println("구매처의 주소를 입력하세요");
		bean.setSaddr(sc.nextLine());
		System.out.println("구매처의 전화번호를 입력하세요");
		bean.setSnumber(sc.nextInt());
		sc.nextLine();
		System.out.println("구매처의 대표자명을 입력하세요");
		bean.setSrepresent(sc.nextLine());


		rs = dao.editsale(bean);
		if (rs.next()) {
			System.out.println("사용자를 수정하였습니다.");
		} else
			System.out.println("사용자 수정 실패");

	}

}