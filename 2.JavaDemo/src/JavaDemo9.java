// 代码块
class Person9{
	public Person9(){
		System.out.println("【构造方法】Person类构造方法执行");
	}
	{  // 2.构造块
		System.out.println("【构造块】Person构造块执行");
	}
	static { // 3.静态代码块
		System.out.println("【静态代码块】优先于构造方法和构造块执行，且只执行一次");
	}
}


public class JavaDemo9 {	
	static{
		System.out.println("【静态代码块】优先主类执行");
	}
	public static void main(String args[]){
		{  // 1. 普通代码块
			int x = 10;
			System.out.println("x :" + x);
		}
		int x = 100;   // 全局变量
		System.out.println("x :" + x);
		
		//*****************************
		// 2.构造块
		new Person9();// 实例化对象的时候，构造块的内容先执行，构造方法的内容后执行
		new Person9();
		new Person9();
		
	}

}
