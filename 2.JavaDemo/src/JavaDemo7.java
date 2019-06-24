// 定义static属性和方法
class Person7{
	private String name;
	private int age;
	private static String country = "中华民国";       // 一.声明被封装的static属性
	
	public Person7(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public static void setCountry(String c){     // 二.static 方法声明：1.不能static String 【country】要用不一样的变量名称
		country = c;                                                          // 2.country 不能使用this，因为不是该对象属性，而是static全局属性
	    //getInfo()  ;       //  static 方法不允许调用非static属性与方法
	}
	// setter、getter略
	public String getInfo(){
		setCountry("xxx");                // 非 static 方法允许调用static属性与方法
		return "姓名：" + this.name + "\n年龄：" + this.age + "\n国家：" + country;
	}
	
}

public class JavaDemo7 {
	public static void main(String args[]){
		Person7.setCountry("中华人民共和国"); // 二.类名称直接调用static方法
		Person7 per = new Person7("张三",18);
		System.out.println(per.getInfo());
	}
}
