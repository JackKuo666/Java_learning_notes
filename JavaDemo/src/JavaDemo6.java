// 定义一个简单Java类
class Dept{  // 1.类名称可以明确描述出某类事物
	private long deptno;   // 2.类中的属性必须使用private进行封装
	private String dname;
	private String loc;
	
	public Dept(){} // 3.必须提供无参构造
	// 有参构造
	public Dept(long deptno, String dname, String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	// 2.2封装后必须有setter、getter
	public void setDeptno(long deptno){
		this.deptno = deptno;
	}
	public void setDname(String dname){
		this.dname = dname;
	}
	public void setLoc(String loc){
		this.loc = loc;
	}
	public long getDeptno(){
		return this.deptno;
	}
	public String getDname(){
		return this.dname;
	}
	public String getLoc(){
		return this.loc;
	}
	
	// 4.不允许输出语句，所有内容必须返回，可以有一个返回方法getInfo()
	public String getInfo(){
		return "【部门信息】：" + "\n部门编号：" + this.deptno + "\n部门名字：" + this.dname + "\n部门位置：" + this.loc;
	}
	
}
public class JavaDemo6 {
	public static void main(String args[]){
		Dept dept = new Dept(007,"财务部","丰台区");
		System.out.println(dept.getInfo());
	}
}
