// 1.成员属性封装
// 2.构造方法
class Person2{
	// 定义属性
	private String name;
	private int age;

	// 2.1构造方法
	public Person2(String n, int a){                   // 注意：这里没有返回值定义
		name = n;               // 类中的属性初始化
		age = a;                  // 类中的属性初始化
	}
	// 2.2构造方法重载
	public Person2(String n){
		name = n;               // 类中的属性初始化
	}
	
	
	// 定义方法
	public void tell(){
		System.out.println("姓名：" + name + "、年龄：" + age);
	}
	
	// 1.成员属性封装：设置setter和getter
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		if (a> 0){
			age = a;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
}
public class JavaDemo2 {
	public static void main(String args[]){
		Person2 per = new Person2("李四",20);  // 声明并实例化对象
		per.setName("张三");
		per.setAge(-18);
		per.tell();
		
		// 匿名对象
		new Person2("匿名对象",0).tell();
	}

}
