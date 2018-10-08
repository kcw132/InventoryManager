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
			mainmenu();
			int menu = sc.nextInt();
			sc.nextLine();			
			if (menu == 2) {
				purchasemenu();
				menu = sc.nextInt();
				if(menu==1) {
					rp.PurchaseView();
				}
				else if(menu==2) {
					rp.insertPurchase();
				}
				else if(menu==3) {
					rp.deletePurchase();
				}
				else if(menu==4) {
					rp.editPurchase();
				}
			}
			else if (menu == 1) 
				rp.insertPurchase();							
			else if (menu == 0)
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
			else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
	
	public static void mainmenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("0.품목정보관리");
		System.out.println("1.창고정보관리");
		System.out.println("2.구매업체관리");
		System.out.println("3.판매업체관리");
		System.out.println("4.프로그램종료");
		
	}
	public static void purchasemenu() {
		System.out.println("1.구매업체조회");
		System.out.println("2.구매업체입력");
		System.out.println("3.구매업체삭제");
		System.out.println("4.구매업체수정");
	}
}
