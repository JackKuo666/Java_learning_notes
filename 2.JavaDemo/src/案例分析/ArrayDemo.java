package 案例分析;

public class ArrayDemo {
	public static void main(String args[]){
		// 1.使用数组的动态初始化实现数组的定义
		int data [] = new int[3];
		System.out.println("数组初始值：");
		for (int x = 0; x < data.length; x ++){
			System.out.println(data[x]);
		}
		data [0] = 11; // 为数组设置内容
		data [1] = 23;
		data [2] = 56;
		System.out.println("更改数组值后：");
		for (int x = 0; x < data.length; x ++){
			System.out.println(data[x]);
		}
		
		// 2.使用数组的静态初始化实现数组的定义
		int data2 [] = new int [] {11,22,33};
		System.out.println("静态初始化数组：");
		for (int x = 0; x < data2.length; x ++){
			System.out.println(data2[x]);
		}

		// 3.引用传递
		int temp [] = data2; 
		temp[0] = 99;
		System.out.println("引用传递数组：");
		for (int x = 0; x < data2.length; x ++){
			System.out.println(data2[x]);
		}
		
		// 4.foreach使用
		System.out.println("for each 使用：");
		int data3 [] = new int [] {1, 2, 3, 4, 5};
		for (int tmp : data3){
			System.out.println(tmp);
		}
		
		// 5.二维数组
		System.out.println("二维数组 使用：");
		int data5 [][] = new int [][]{
				{1, 2, 3, 4, 5}, {1, 2, 3}, {5, 6, 7, 8}};
		for (int x = 0; x < data5.length; x ++){
			for (int y = 0; y < data5[x].length; y++){
				System.out.println("data["+x+"] ["+y+"] = " +data5[x][y]);
			}
	    	System.out.println();
		}
		
		// 6.for each打印二维数组
		System.out.println("6. for each打印二维数组");
		for(int tmp [] : data5){
			for(int x : tmp){
				System.out.print(x + "、");
			}
			System.out.println();
		}
	}

}











