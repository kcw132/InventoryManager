package co.micol.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import co.micol.bean.ProductBean;
import co.micol.dao.ProductDao;

public class ProductModel {
	private ResultSet rs;

	private ProductDao pd = new ProductDao();
	private ProductBean pb = new ProductBean();
	private Scanner scq = new Scanner(System.in);

	public ResultSet ProductAll() throws SQLException {
		rs = pd.getDataProduct();
		while (rs.next()) {
			pb = new ProductBean();
			pb.setCcode(rs.getString("ccode"));
			pb.setPcode(rs.getString("pcode"));
			pb.setPname(rs.getString("pname"));
			pb.setStan(rs.getString("stan"));
			pb.setUnit(rs.getString("unit"));

			pb.toppp();
		}
		return rs;
	}

	public void ProductInsert() throws SQLException {
		System.out.println("분류코드를 입력하세요.");
		pb.setCcode(scq.nextLine());
		System.out.println("상품코드를 입력하세요.");
		pb.setPcode(scq.nextLine());
		System.out.println("상품명를 입력하세요.");
		pb.setPname(scq.nextLine());
		System.out.println("규격를 입력하세요.");
		pb.setStan(scq.nextLine());
		System.out.println("단위를 입력하세요.");
		pb.setUnit(scq.nextLine());

		rs = pd.insertDataProduct(pb);

		if (rs.next()) {
			System.out.println("상품이 입력되었습니다.");
		} else {
			System.out.println("상품 입력을 실패하였습니다.");
		}
	}
	
	public void ProductUpdate() throws SQLException {
		System.out.println("변경할 상품의 상품코드를 입력하세요.");
		pb.setPcode(scq.nextLine());
		System.out.println("상품명을 입력하세요.");
		pb.setPname(scq.nextLine());
		System.out.println("규격을 입력하세요");
		pb.setStan(scq.nextLine());
		System.out.println("단위를 입력하세요");
		pb.setUnit(scq.nextLine());
		
		rs = pd.updateDataProduct(pb);
		
		if(rs.next()) {
			System.out.println("상품정보가 변경되었습니다.");
		}
		else {
			System.out.println("상품정보 변경을 실패하였습니다.");
		}
	}
	
}
