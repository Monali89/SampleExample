package Encapsulation;

public class Amazon
{
private int otp=1234;
private String password="Monali";
private double salary=10000;
private int age=20;
	 
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
	Amazon a1=new Amazon();
	a1.setOtp(9999);
	System.out.println(a1.getOtp());
	a1.setPassword("trisha");
	System.out.println(a1.getPassword());
	a1.setAge(43);
	System.out.println(a1.getAge());
	a1.setSalary(123455556);
	System.out.println(a1.getSalary());
	}

}
