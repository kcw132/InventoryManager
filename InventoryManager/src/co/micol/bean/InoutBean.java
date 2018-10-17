package co.micol.bean;

public class InoutBean {			//입출고내역
//	private int ionum;				//입출고번호		p12312 s123123	
	private String pcode;			//품목코드
	private String pname;			//품목명
	private String goocount;			//입고수량
	private String pancount;			//판매수량
//	private String wname;			//창고이름
	private String iodate;			//입출고일자
	
	
//	public int getIonum() {
//		return ionum;
//	}
//	public void setIonum(int ionum) {
//		this.ionum = ionum;
//	}
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
	public String getGoocount() {
		return goocount;
	}
	public void setGoocount(String string) {
		this.goocount = string;
	}
	public String getPancount() {
		return pancount;
	}
	public void setPancount(String pancount) {
		this.pancount = pancount;
	}
//	public String getWname() {
//		return wname;
//	}
//	public void setWname(String wname) {
//		this.wname = wname;
//	}
	public String getIodate() {
		return iodate;
	}
	public void setIodate(String iodate) {
		this.iodate = iodate;
	}
	@Override
	public String toString() {
		System.out.println("pcode=" + pcode + ", pname=" + pname + ", goocount=" + goocount + ", pancount=" + pancount
				+ ", iodate=" + iodate);
		return null;
	}
	
	
}
