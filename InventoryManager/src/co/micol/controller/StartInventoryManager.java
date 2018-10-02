package co.micol.controller;

import java.sql.SQLException;

import co.micol.model.PurchaseModel;


public class StartInventoryManager {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		PurchaseModel rs = new PurchaseModel();
//		rs.userView();
		PurchaseModel rs1 = new PurchaseModel();
		rs1.insertPurchase();
		System.out.println();
	}

	}


