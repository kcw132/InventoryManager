package co.micol.bean;

public class EnterBean {		//입고화면
	private String goonum;		//구매번호
	private int lnum;			//라인릴리즈
	private String pcode;		//품목코드
	private String pname;		//품목명
	private int inamount;		//수량
	private int price;			//단가
	private int tprice;			//금액
	private String enterdate;	//구매일자
	private String entercom;	//구매처
	
	public String getGoonum() {
		return goonum;
	}
	public void setGoonum(String goonum) {
		this.goonum = goonum;
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
	public int getInamount() {
		return inamount;
	}
	public void setInamount(int inamount) {
		this.inamount = inamount;
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
	public String getEnterdate() {
		return enterdate;
	}
	public void setEnterdate(String enterdate) {
		this.enterdate = enterdate;
	}
	public String getEntercom() {
		return entercom;
	}
	public void setEntercom(String entercom) {
		this.entercom = entercom;
	}
	
	
}
