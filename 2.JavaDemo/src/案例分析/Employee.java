package 案例分析;
// 员工信息
class Employee1{
	private long empno;
	private String ename;
	private double salary;
	private double rate;
	
	public Employee1(){}
	public Employee1(long empno, String ename, double salary,double rate){
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.rate = rate;
	}
	// setter、getter略
	public String getInfo(){
		return "雇员编号：" + this.empno
				+ "\n雇员姓名：" + this.ename
				+ "\n雇员薪水：" + this.salary
				+ "\n工资增长率：" + this.rate;
	}
	// 计算薪水增长额度
	public double salaryIncValue(){
		return this.salary * this.rate ;
	}
	// 计算薪水总额
	public double salaryIncResult(){
		this.salary = this.salary * (1 + this.rate);
		return this.salary;
	}
	
}
public class Employee {
	public static void main(String args[]){
		Employee1 emp = new Employee1(7369L, "史密斯", 3000.0, 0.3);
		System.out.println(emp.getInfo());
		System.out.println("工资调整额度：" + emp.salaryIncValue());
		System.out.println("上调后的工资：" + emp.salaryIncResult());
	}

}
