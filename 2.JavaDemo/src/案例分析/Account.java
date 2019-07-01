package 案例分析;
class Account1{
	private String name;
	private double balance;
	public Account1(){}
	public Account1(String name){
		this(name, 0.0); // 调用双参构造
	}
	public Account1(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	// setter、getter略
	public double getBalance(){
		return this.balance;
	}
	public String getInfo(){
		return "账户名称：" + this.name
				+ "\n账户余额：" + this.balance;
	}
	
}
public class Account {
	public static void main(String args[]){
		Account1 account = new Account1("小明", 9000000.0);
		System.out.println(account.getInfo());
		System.out.println(account.getBalance());
		
	}

}
