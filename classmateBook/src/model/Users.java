package model;

public class Users {
	private String Usno;			//学号
	private String Uspassword;		//账户密码
	private String Uspost;			//职位
	private String Ucname;			//班级
	private String Usname;			//姓名
	private String Usaddress;		//地址
	private String Ustele;			//电话
	private String Usweixin;		//微信
	private String Usyouxiangadd;	//邮箱
	private String Usqq;			//qq
	private String Usdiy;	
	public String getUsno() {
		return Usno;
	}
	public void setUsno(String usno) {
		Usno = usno;
	}
	public String getUspassword() {
		return Uspassword;
	}
	public void setUspassword(String uspassword) {
		Uspassword = uspassword;
	}
	public String getUspost() {
		return Uspost;
	}
	public void setUspost(String uspost) {
		Uspost = uspost;
	}
	public String getUcname() {
		return Ucname;
	}
	public void setUcname(String ucname) {
		Ucname = ucname;
	}
	public String getUsname() {
		return Usname;
	}
	public void setUsname(String usname) {
		Usname = usname;
	}
	public String getUsaddress() {
		return Usaddress;
	}
	public void setUsaddress(String usaddress) {
		Usaddress = usaddress;
	}
	public String getUstele() {
		return Ustele;
	}
	public void setUstele(String ustele) {
		Ustele = ustele;
	}
	public String getUsweixin() {
		return Usweixin;
	}
	public void setUsweixin(String usweixin) {
		Usweixin = usweixin;
	}
	public String getUsyouxiangadd() {
		return Usyouxiangadd;
	}
	public void setUsyouxiangadd(String usyouxiangadd) {
		Usyouxiangadd = usyouxiangadd;
	}
	public String getUsqq() {
		return Usqq;
	}
	public void setUsqq(String usqq) {
		Usqq = usqq;
	}
	public String getUsdiy() {
		return Usdiy;
	}
	public void setUsdiy(String usdiy) {
		Usdiy = usdiy;
	}
	 public String toString(){
	        
	        return "学号:"+Usno+"\n"+" 姓名:"+Usname+"\n"+" 职位:"+Uspost+"\n"+" 班级:"+Ucname+"\n"+
	         " 地址:"+Usaddress+"\n"+" 电话:"+Ustele+"\n"+" 微信:"+Usweixin+"\n"+" QQ:"+Usqq+"\n"+" 邮箱:"+Usyouxiangadd+"\n";
	        
	    }

	
}
