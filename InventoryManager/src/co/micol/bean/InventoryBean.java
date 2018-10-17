package co.micol.bean;

public class InventoryBean {		//재고화면
	private String pcode;			//상품코드
	private String pname;			//상품명
	private int price;				//단가
	private String gooname;			//구입처
	private String wlocation;		//창고위치
	private int iamount;			//재고수량
	
	
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGooname() {
		return gooname;
	}
	public void setGooname(String gooname) {
		this.gooname = gooname;
	}
	public String getWlocation() {
		return wlocation;
	}
	public void setWlocation(String wlocation) {
		this.wlocation = wlocation;
	}
	public int getIamount() {
		return iamount;
	}
	public void setIamount(int iamount) {
		this.iamount = iamount;
	}
	@Override
	public String toString() {
		System.out.println("pcode=" + pcode + ", pname=" + pname + ", price=" + price + "gooname=" + gooname
				+ ", wlocation=" + wlocation + ", iamount=" + iamount);
		return null;
	}
	
	
}
