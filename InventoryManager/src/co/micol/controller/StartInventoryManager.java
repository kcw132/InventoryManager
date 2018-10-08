package co.micol.controller;

import java.sql.SQLException;
import java.util.Scanner;

import co.micol.model.PurchaseModel;
import co.micol.model.SaleModel;

public class StartInventoryManager {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		PurchaseModel rp = new PurchaseModel();
		SaleModel rs = new SaleModel();

		while (true) {
			menu();
			int menu = sc.nextInt();
			sc.nextLine();
			
						
			if (menu == 0)
				rp.PurchaseView();
			else if (menu == 1) 
				rp.insertPurchase();							
			else if (menu == 2)
				rp.deletePurchase();
			else if (menu == 3)
				rp.editPurchase();
			else if (menu == 4)
				rs.saleView();
			else if (menu == 5)
				rs.insertsale();
			else if (menu == 6)
				rs.deletesale();
			else if (menu == 7)
				rs.editsale();
			else if (menu == 8) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
	
	public static void menu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("0.구매업체리스트");
		System.out.println("1.구매업체입력");
		System.out.println("2.구매업체삭제");
		System.out.println("3.구매업체수정");
		System.out.println("4.판매업체리스트");
		System.out.println("5.판매업체입력");
		System.out.println("6.판매업체삭제");
		System.out.println("7.판매업체스장");
		System.out.println("8.메뉴종료");
		
	}
}
