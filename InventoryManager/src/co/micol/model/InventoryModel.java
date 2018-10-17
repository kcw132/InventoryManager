package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.bean.InventoryBean;
import co.micol.dao.InventoryDao;

public class InventoryModel {
	private InventoryDao id = new InventoryDao();
	private InventoryBean ib = new InventoryBean();
	private ResultSet rs;
	
	public ResultSet Inventoryshow() throws SQLException {
		rs = id.getDataInventory();
		while(rs.next()) {
			ib = new InventoryBean();
			
			ib.setPcode(rs.getString("pcode"));
			ib.setPname(rs.getString("pname"));
			ib.setPrice(rs.getInt("price"));
			ib.setGooname(rs.getString("gooname"));
			ib.setWlocation(rs.getString("wlocation"));
			ib.setIamount(rs.getInt("iamount"));
			
			ib.toString();
		}
		return rs;
	}
	
}
