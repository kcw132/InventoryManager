package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import co.micol.bean.PurchaseBean;
import co.micol.dao.PurchaseDao;


public class PurchaseModel {
	private PurchaseBean bean = new PurchaseBean();
	private PurchaseDao dao = new PurchaseDao();
	private ResultSet rs;
	private String bcode;
	private String bname;
	private String baddr;
	private String bnumber;
	private String brepresent;


	
			
		
	
		public void userView() throws SQLException {			//조회
		rs = dao.userView();
		if(rs.next()) {
			do {
				bean = new PurchaseBean();
				bean.setBcode(rs.getString("bcode"));
				bean.setBname(rs.getString("bname"));
				bean.setBaddr(rs.getString("baddr"));
				bean.setBnumber(rs.getInt("bnumber"));
				bean.setBrepresent(rs.getString("brepresent"));				
				bean.toString();						
			} while(rs.next());
		} else System.out.println("게시글이 존재하지 않습니다.");
		rs.close();
	}
	
	
	public void insertPurchase() throws SQLException {			//입력
	
	Scanner sc = new Scanner(System.in);
	System.out.println("구매처의 업체코드를 입력하세요.");
	bean.setBcode(sc.nextLine());
	System.out.println("구매처의 업체명을 입력하세요.");
	bean.setBname(sc.nextLine());
	System.out.println("구매처의 주소를 입력하세요.");
	bean.setBaddr(sc.nextLine());
	System.out.println("구매처의 연락처를 입력하세요.");
	bean.setBnumber(sc.nextInt());
	sc.nextLine();
	System.out.println("구매처의 대표자명을 입력하세요.");
	bean.setBrepresent(sc.nextLine());
	
	rs = dao.insertPurchase(bean);
	sc.close();
	if(rs.next()) {
		System.out.println("사용자를 수정하였습니다.");
	} else System.out.println("사용자 수정 실패");
	rs.close();
}
	
	
	
	public void deletePurchase( ) throws SQLException {  //사용자 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("삭제할 사용자 ID를 입력하세요");
		rs = dao.deletePurchase(sc.next());
		sc.close();
		if(rs.next()) {
			System.out.println("사용자를 삭제하였습니다.");
		} else System.out.println("사용자 삭제 실패");
		rs.close();
	}
	
	
	public void editPurchase() throws SQLException {   //사용자 수정
		Scanner	sc = new Scanner(System.in);
		userView();
		System.out.println("======================");
		System.out.println("구매처의 코드를 선력하세요");
		bean.setBcode(sc.nextLine());
		System.out.println("구매처의 이름을 입력하세요");
		bean.setBname(sc.nextLine());
		System.out.println("구매처의 주소를 입력하세요");
		bean.setBaddr(sc.nextLine());
		System.out.println("구매처의 전화번호를 입력하세요");
		bean.setBnumber(sc.nextInt());
		sc.nextLine();
		System.out.println("구매처의 대표자명을 입력하세요");
		bean.setBrepresent(sc.nextLine());
		sc.close();
		
		rs = dao.edit(bean);
		if(rs.next()) {
			System.out.println("사용자를 수정하였습니다.");			
		} else System.out.println("사용자 수정 실패");
		rs.close();
	}
	


		
	
	
}
