package com.employees.app;

public class Employee {
	private int empId;
	private String name;
	private String salary;
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(String salary) {
		this.salary=salary;
	}
	public String getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setName("Akanksha");
		emp.setSalary("30000");
		System.out.println(emp.getEmpId()+"\n"+emp.getSalary()+"\n"+emp.getName());
	}

}
