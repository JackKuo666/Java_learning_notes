// 使用this调用当前类中的属性，方法
class Person4{
	String name;
	int age;
	public Person4(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void tell(){
		System.out.println("name:" + this.name + "\nage:" + this.age);
	}
	
}
public class JavaDemo4 {
	public static void main(String args[]){
		Person4 per = new Person4("张三", 20);
		per.tell();
	}

}
