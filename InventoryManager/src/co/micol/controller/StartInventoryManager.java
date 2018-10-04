package co.micol.controller;

import java.sql.SQLException;

import co.micol.model.PurchaseModel;
import co.micol.model.SaleModel;

public class StartInventoryManager {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int menu = 0;
		PurchaseModel rp = new PurchaseModel();
		SaleModel rs = new SaleModel();

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

	}
}
