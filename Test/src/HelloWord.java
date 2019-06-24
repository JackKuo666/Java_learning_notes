
public class HelloWord {                                    // 主类
    public static void main(String []args) {    // 主方法
        System.out.print("Hello ");                          // 不换行打印
        System.out.println("World");                     // 换行打印
        System.out.println("Hello World");
        
        // char
        char c = 'A';      // 定义一个字符型变量
        int num = c;    //  可以获得字符的编码
        System.out.println(num);  // 打印 字符编码
        
        // 关系运算符
        int x = 10;
        int y = 11;
        boolean z = x > y;
        System.out.println(z);
        
        // if分支结构
        int age = 18;
        if (age >= 18 && age <= 20){
        	System.out.println("yes");
        }
        else if (age < 18){
        	System.out.println("lower");
        }
        else{
        	System.out.println("big");
        }
        
        // switch
        int ch = 2;
        switch (ch) {
        	case 2 :                                       // 这里{}可以没有
        		System.out.println("2");   // 这里没有break就会继续执行下去
        	case 1:{
        		System.out.println("1");
        		break;
        	}
        	default:{
        		System.out.println("no");
        		break;
        	}
        }
        
        
        // while
        int sum = 0;
        int n = 1;
        while (n <= 100){
        	sum += n;
        	n ++;
        }
        System.out.println(sum);
        
        // do while
        sum = 0;
        n = 1;
        do{
        	sum += n;
        	n ++;
        }while(n<=100);
        System.out.println(sum);
        
        // for 循环
        sum = 0;
        for (int i = 1; i <= 100; i++){
        	sum += i ;
        }
        System.out.println(sum);
        
        
        // 大印乘法口诀表
        for (int i = 1; i <= 9 ; i ++){
        	for (int j = 1; j <= i; j++){
        		System.out.print(j + "*" + i +"=" + (i+i)+"\t");
        	}
        	System.out.println();
        }
        
        // 打印*
        int line  = 5 ;
        for ( x = 0; x < line; x ++){
        	for ( y = 0; y < line - x; y++){
        		System.out.print(" ");
        	}
        	for ( y = 0; y <= x; y++){
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
        
        // 调用方法1
        printMessage();
        
        // 调用方法2
        System.out.println(get(12));
        
        // 3.方法重载
        int resultA = sum(10,20);
        int resultB = sum(10,20,30);
        double resultC = sum(10.2 , 30.2);
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        
        // 4.方法递归调用
        System.out.println(sum_2(100));
    
    }
    
    
    // 1.定义一个无参无返回的方法
    public static void printMessage(){
    	System.out.println("1.无参无返回的方法");	
    }
    
    // 2.定义一个有参数有返回的方法
    public static String get(double money){
    	if (money >= 10.0){
    		return "yes:"+ (money - 1);
    	}
    	else{
    		return "sorry";
    	}		
    }
    
    
    // 3. 方法重载
    public static int sum(int x, int y){
    	return x + y;
    }
    
    public static int sum(int x, int y, int z){
    	return x + y +z ;
    }
    
    public static double sum(double x, double y){
    	return x + y ;
    }
    
    // 4. 递归调用
    public static int sum_2(int num){
    	if (num == 1){
    		return 1;             // 终止条件
    	}
    	return num + sum_2(num - 1);
    }
    
}
// 单行注释

/* 
 
  多行注释*/


/**
 文档注释
  
  */


class A{}                                                                   // 非主类： 在编译的时候也会产生 *.class文件
class B{}
class C{}
