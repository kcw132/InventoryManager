package co.micol.bean;

public class SaleBean {			//판매업체관리
	private String scode;		//업체명
	private String sname;		//업체명
	private String saddr;		//주소
	private int snumber;		//연락처
	private String srepresent;	//대표자명
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public int getSnumber() {
		return snumber;
	}
	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}
	public String getSrepresent() {
		return srepresent;
	}
	public void setSrepresent(String srepresent) {
		this.srepresent = srepresent;
	}
	
	
}
