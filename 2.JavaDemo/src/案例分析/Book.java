package 案例分析;
class Book1{
	private int bid;
	private String title;
	private double price;
	private static int count = 0;
	public Book1(String title, double price){
		this.bid = count + 1;
		this.title = title;
		this.price = price;
		count ++;
	}
	// setter、getter略
	public String getInfo(){
		return "图书编号：" + this.bid
				+ "\n名称：" + this.title
				+ "\n价格：" + this.price;
				
	}
	public static int getCount(){
		return count;
	}
}

public class Book {
	public static void main(String args[]){
		Book1 b1 = new Book1("Java", 89.2);
		Book1 b2 = new Book1("Oracle", 79.2);
		System.out.println(b1.getInfo());
		System.out.println(b2.getInfo());
		System.out.println("数量："+Book1.getCount());
		
	}

}
