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
	
	
//	void Purchase() throws SQLException {
//		rs = dao.Purchase();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구매처의 업체코드를 입력하세요.");
//		bcode = sc.nextLine();
//		System.out.println("구매처의 업체명을 입력하세요.");
//		bname = sc.nextLine();
//		System.out.println("구매처의 주소를 입력하세요.");
//		baddr = sc.nextLine();
//		System.out.println("구매처의 연락처를 입력하세요.");
//		bnumber = sc.nextLine();
//		System.out.println("구매처의 대표자명울 입력하세요.");
//		brepresent = sc.nextLine();
//		
//		
//		sc.close();		
//	}
	
	public void userView() throws SQLException {
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
}
