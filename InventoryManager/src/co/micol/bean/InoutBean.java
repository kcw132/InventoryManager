package co.micol.bean;

public class InoutBean {			//입출고내역
	private int ionum;				//입출고번호		p12312 s123123	
	private String pcode;			//품목코드
	private String pname;			//품목명
	private int goocount;			//입고수량
	private int pancount;			//판매수량
	private String wname;			//창고이름
	private String iodate;			//입출고일자
	
	
	public int getIonum() {
		return ionum;
	}
	public void setIonum(int ionum) {
		this.ionum = ionum;
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
	public int getGoocount() {
		return goocount;
	}
	public void setGoocount(int goocount) {
		this.goocount = goocount;
	}
	public int getPancount() {
		return pancount;
	}
	public void setPancount(int pancount) {
		this.pancount = pancount;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getIodate() {
		return iodate;
	}
	public void setIodate(String iodate) {
		this.iodate = iodate;
	}
	
	
}
