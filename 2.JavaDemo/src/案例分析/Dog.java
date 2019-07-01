package 案例分析;
class Dog1{
	private String name;
	private String color;
	private int age;
	public Dog1(){}
	public Dog1(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	// setter、getter略
	public String getInfo(){
		return "狗的名字：" + this.name
				+ "\n狗的颜色：" + this.color
				+ "\n够的年龄：" + this.age;
	}
	
}


public class Dog {
	public static void main(String args[]){
		Dog1 dog = new Dog1("高高", "白色", 1);
		System.out.println(dog.getInfo());
	}

}
