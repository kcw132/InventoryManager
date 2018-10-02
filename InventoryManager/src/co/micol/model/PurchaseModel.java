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
	private int purchase;
	private ResultSet rs1;
	
	
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
		System.out.println("구매처의 대표자명을 입력하세요.");
		bean.setBrepresent(sc.nextLine());
		
		rs1 = dao.insertPurchase(bean);
		sc.close();		
		if(purchase != 0) {
			System.out.println("사용자를 수정하였습니다.");
		} else System.out.println("사용자 수정 실패");
	}

	
	//bean.setUserId(sc.nextLine());
	//bcode = sc.nextLine();
	
	
	//	public void userView() throws SQLException {
//		rs = dao.userView();
//		if(rs.next()) {
//			do {
//				bean = new PurchaseBean();
//				bean.setBcode(rs.getString("bcode"));
//				bean.setBname(rs.getString("bname"));
//				bean.setBaddr(rs.getString("baddr"));
//				bean.setBnumber(rs.getInt("bnumber"));
//				bean.setBrepresent(rs.getString("brepresent"));				
//				bean.toString();						
//			} while(rs.next());
//		} else System.out.println("게시글이 존재하지 않습니다.");
//		rs.close();
//	}
}
