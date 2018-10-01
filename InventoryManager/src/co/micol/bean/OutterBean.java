package co.micol.bean;

public class OutterBean {		//출고화면
	private String pannum;		//판매화면
	private int lnum;			//라인번호	
	private String pcode;		//품목코드
	private String pname;		//품목명
	private int outamount;		//수량
	private int price;			//판매가
	private int tprice;			//금액
	private String outdate;		//판매일자
	private String pancom;		//판매처
	
	public String getPannum() {
		return pannum;
	}
	public void setPannum(String pannum) {
		this.pannum = pannum;
	}
	public int getLnum() {
		return lnum;
	}
	public void setLnum(int lnum) {
		this.lnum = lnum;
	}
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
	public int getOutamount() {
		return outamount;
	}
	public void setOutamount(int outamount) {
		this.outamount = outamount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTprice() {
		return tprice;
	}
	public void setTprice(int tprice) {
		this.tprice = tprice;
	}
	public String getOutdate() {
		return outdate;
	}
	public void setOutdate(String outdate) {
		this.outdate = outdate;
	}
	public String getPancom() {
		return pancom;
	}
	public void setPancom(String pancom) {
		this.pancom = pancom;
	}
	
	
}
