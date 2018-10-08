package co.micol.bean;

public class WareinfoBean {		//창고정보
	private String wcode;		//창고코드
	private String wname;		//창고명
	private String winfo;		//설명

	
	public String getWcode() {
		return wcode;
	}
	public void setWcode(String wcode) {
		this.wcode = wcode;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWinfo() {
		return winfo;
	}
	public void setWinfo(String winfo) {
		this.winfo = winfo;
	}
	public void toppp() {
		// TODO Auto-generated method stub
		System.out.printf("%s\t %s\t %s\t \n",wcode,wcode,winfo);
	}
	
	
}
