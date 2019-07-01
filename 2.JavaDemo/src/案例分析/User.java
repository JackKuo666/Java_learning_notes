package 案例分析;
class User1{
	private String uid;
	private String password;
	private static int count = 0;
	public User1(){
		this("Noid", "password");
	}
	public User1(String uid){
		this(uid, "password");
	}
	public User1(String uid, String password){
		this.uid = uid;
		this.password = password;
		count ++;
	}
	// setter、getter略
	public String getInfo(){
		return "用户名：" + this.uid
				+ "\n密码：" + this.password;
	}
	public static int getCount(){
		return count; // 获取用户个数
	}
	
}

public class User {
	public static void main(String args[]){
		User1 userA = new User1();
		User1 userB = new User1("小强");
		User1 userC = new User1("大强","132");
		System.out.println(userA.getInfo());
		System.out.println(userB.getInfo());
		System.out.println(userC.getInfo());
		System.out.println("用户个数：" + User1.getCount());
		
	}

}
