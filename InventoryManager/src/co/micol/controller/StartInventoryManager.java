package co.micol.controller;

import java.sql.SQLException;

//import co.micol.model.PurchaseModel;
import co.micol.model.SaleModel;


public class StartInventoryManager {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		PurchaseModel rs = new PurchaseModel();
//		rs.PurchaseView();		
//		rs.insertPurchase();		
//		rs.deletePurchase();				
//		rs.editPurchase();
		
		SaleModel rs = new SaleModel();
//		rs.saleView();
		rs.insertsale();
//		rs.deletesale();
//		rs.editsale();
		
		
		
		}
	}


