// this 描述类内的方法：构造方法+普通方法
class Emp {
	private long empno ; // 员工编号
	private String ename; // 员工姓名
	private String dept;     // 部门名词
	private double sala; // 基本工资
	
	// 构造方法
	public Emp(){                                // 无参构造方法
		this(1000, "无名氏", null, 0.0);
//		this.empno = 1000;
//		this.ename = "无名氏";
	}
	public Emp(long empno){       // 单参构造方法
		this(empno, "新员工", "未定", 0.0);
//		this.empno = empno;
//		this.ename = "新员工";
//		this.dept = "未定";
	}
	public Emp(long empno, String ename,String dept){  // 三参构造方法
		this(empno, ename, dept, 0.0);
//		this.empno = empno;
//		this.ename = ename;
//		this.dept = dept;
	}
	public Emp(long empno, String ename,String dept,double sala){  // 四参构造方法
		this.empno = empno;
		this.ename = ename;
		this.dept = dept;
		this.sala = sala;
	}
	
	// settter、getter省略
	
	// 普通方法
	public String getInfo(){
		return "雇员编号：" + this.empno +
				    "\n雇员姓名：" + this.ename +
				    "\n所在部门：" + this.dept +
				    "\n基本工资：" + this.sala;
	}
}
public class JavaDemo5 {
	public static void main(String args[]){
		Emp emp = new Emp(7369L, "史密斯", "财务部", 6500.00);
		System.out.println(emp.getInfo());
	}

}
