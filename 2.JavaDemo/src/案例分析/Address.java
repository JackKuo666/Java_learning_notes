package 案例分析;
class Address1{
	private String country;
	private String province;
	private String city;
	private String street;
	private String zipcode;
	
	// 构造方法：无参+有参
	public Address1(){} 
	public Address1(String country,String province,  String city,String street,String zipcode){
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}
	
	// getInfo方法
	public String getInfo(){
		return "国家： " + this.country
				+ "\n省份：" + this.province
				+ "\n城市：" + this.city
				+ "\n街道：" + this.street
				+ "\n邮编：" + this.zipcode;
	}
	
	// setter方法
	public void setCountry(String country){
		this.country = country;
	}
	public void setProvince(String province){
		this.province = province;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}
	
	// getter方法
	public String getCountry(){
		return this.country;
	}
	public String getProvice(){
		return this.province;
	}
	public String getCity(){
		return this.city;
	}
	public String getStreet(){
		return this.street;
	}
	public String getZipcode(){
		return this.zipcode;
	}
	
}
public class Address {
	public static void main(String args[]){
		System.out.print(new Address1("中国", "浙江省", "杭州市","西湖街道","10001").getInfo());
	}

}
