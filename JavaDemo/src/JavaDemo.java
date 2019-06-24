class Person {     // 定义一个类
	// 定义属性
	String name;    // 人员的姓名
	int age;              // 人员年龄
	
	// 定义操作方法
	public void tell(){
		System.out.println("姓名：" + name + "、年龄：" + age);
	}
}




public class JavaDemo {
	public static void main(String args[]){
		// 一.实例化对象:两种方法（1、2）
		// 1.声明并实例化对象
		Person per = new Person();  

		// 2.1  声明对象
		Person per2 = null;
		// 2.2 实例化对象
		per2 = new Person();
		
		// 二.通过对象进行属性设置
		per.name = "小明";
		per.age = 18;
		
		// 三.通过对象调用方法
		per.tell();
		per2.tell();        // 不设置属性，则为默认值
		

	}

}
