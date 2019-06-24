// static 应用案例：统计书的数量
class Book{
	private String title;
	private static int count = 0;
	public Book(){
		
		this("NoTitle  - " + count ++);      // this构造方法
	}
	
	public Book(String title){
		
		this.title = title;
		
		
	}
	public String getTitle(){
		return  this.title ;
	}
	
}
public class JavaDemo8 {
	public static void main(String args[]){
		System.out.println(new Book ("Java").getTitle());
		System.out.println(new Book ("JSP").getTitle());
		System.out.println(new Book ("Spring").getTitle());
		System.out.println(new Book ().getTitle());
		System.out.println(new Book ().getTitle());
	}

}
