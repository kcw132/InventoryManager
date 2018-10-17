package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import co.micol.bean.InventoryBean;
import co.micol.dao.InventoryDao;

public class InventoryModel {
	private InventoryDao ivd = new InventoryDao();
	private InventoryBean ivb = new InventoryBean();
	private ResultSet rs;
	
	public ResultSet Inventoryshow() throws SQLException {
		rs = ivd.getDataInventory();
		while(rs.next()) {
			ivb = new InventoryBean();
			
			ivb.setPcode(rs.getString("pcode"));
			ivb.setPname(rs.getString("pname"));
			ivb.setPrice(rs.getInt("price"));
			ivb.setGooname(rs.getString("gooname"));
			ivb.setWlocation(rs.getString("wlocation"));
			ivb.setIamount(rs.getInt("iamount"));
			
			ivb.toString();
		}
		return rs;
	}
	
}
