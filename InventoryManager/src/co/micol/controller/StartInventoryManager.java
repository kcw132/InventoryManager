package co.micol.controller;

import java.sql.SQLException;
import java.util.Scanner;

import co.micol.model.ProductModel;
import co.micol.model.PurchaseModel;
import co.micol.model.SaleModel;
import co.micol.model.WareinfoModel;

public class StartInventoryManager {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductModel pm = new ProductModel();
		PurchaseModel rp = new PurchaseModel();
		WareinfoModel wm = new WareinfoModel();
		SaleModel sm = new SaleModel();

		while (true) {
			mainmenu();
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				productmenu();
				menu = sc.nextInt();
				if (menu == 1) {
					pm.ProductAll();
				} else if (menu == 2) {
					pm.ProductInsert();
				} else if (menu == 3) {
					pm.ProductUpdate();
				}
			} 
			else if (menu == 2) {
				purchasemenu();
				menu = sc.nextInt();
				if (menu == 1) {
					wm.WareinfoView();
				} else if (menu == 2) {
					wm.WareinfoInsert();
				} else if (menu == 3) {
					wm.WareinfoUpdate();
				} 
			}
			else if (menu == 3) {
				Waremenu();
				menu = sc.nextInt();
				if (menu == 1) {
					rp.PurchaseView();
				} else if (menu == 2) {
					rp.insertPurchase();
				} else if (menu == 3) {
					rp.deletePurchase();
				} else if (menu == 4) {
					rp.editPurchase();
				}
			}
			else if (menu == 4) {
				salemenu();
				menu = sc.nextInt();
				if (menu == 1) {
					sm.saleView();
				} else if (menu == 2) {
					sm.insertsale();
				} else if (menu == 3) {
					sm.deletesale();
				} else if (menu == 4) {
					sm.editsale();
				}
			}
			
			else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

	public static void mainmenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.물품정보관리");
		System.out.println("2.창고정보관리");
		System.out.println("3.구매업체관리");
		System.out.println("4.판매업체관리");
		System.out.println("5.프로그램종료");

	}

	public static void purchasemenu() {
		System.out.println("1.구매업체조회");
		System.out.println("2.구매업체입력");
		System.out.println("3.구매업체삭제");
		System.out.println("4.구매업체수정");
	}

	public static void productmenu() {
		System.out.println("1.물품정보조회");
		System.out.println("2.물품정보입력");
		System.out.println("3.물품정보수정");
	}
	public static void Waremenu() {
		System.out.println("1.창고정보조회");
		System.out.println("2.창고정보입력");
		System.out.println("3.물품정보수정");
	}
	public static void salemenu() {
		System.out.println("1.판매업체조회");
		System.out.println("2.판매업체입력");
		System.out.println("3.판매업체삭제");
		System.out.println("4.판매업체수정");
	}
}
