package co.micol.bean;

public class ProductBean {		//품목정보화면
	private String ccode; 		//분류코드
	private String pcode;		//상품코드
	private String pname; 		//상품명
	private String stan; 		//규격
	private String unit;		//단위
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
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
	public String getStan() {
		return stan;
	}
	public void setStan(String stan) {
		this.stan = stan;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	} 
	
	
}
