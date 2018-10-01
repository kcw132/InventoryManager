package co.micol.bean;

public class PurchaseBean {		//구매업체관리
	private String bcode;		//업체코드(사업자번호)
	private String bname;		//업체명
	private String baddr;		//주소
	private int bnumber;		//연락처
	private String brepresent;	//대표자명
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBaddr() {
		return baddr;
	}
	public void setBaddr(String baddr) {
		this.baddr = baddr;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public String getBrepresent() {
		return brepresent;
	}
	public void setBrepresent(String brepresent) {
		this.brepresent = brepresent;
	}
	
	@Override
	public String toString() {   //select 출력부
		System.out.println(bcode + "\t" + bname + "\t" + baddr + "\t" + bnumber + "\t" + brepresent + "\t" );
		return null;
	}
}
