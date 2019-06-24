// 方法可以传递类
class Message{
	private String title;
	public Message(String t){   // 构造函数
		title = t;
	}
	public void setTitle(String t){   // 属性封装：setter函数
		title = t;
	}	
	public String getTitle(){      // 属性封装：getter函数
		return title;
	}
	
}


class Person3{
	// 定义属性
	private String name;
	private int age;

	// 2.1构造方法
	public Person3(Message msg, int a){                   // 注意：这里没有返回值定义
		name = msg.getTitle();               // 类中的属性初始化
		age = a;                  // 类中的属性初始化
	}
    
	public Message getInfo(){
		return new Message("姓名："+name +  "\n年龄：" + age );
	}
	
	
	
}
public class JavaDemo3 {
	public static void main(String args[]){
		Message msg = new Message("mldn");          // 声明并实例化对象msg
		Person3 per = new Person3(msg, 20);           // 声明并实例化对象per，同时初始化第一个参数是一个对象
		msg = per.getInfo();
		System.out.println(msg.getTitle());
	}

}
