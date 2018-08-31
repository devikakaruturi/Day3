package com.capgemini.icici.domain;

public class Employeeinformation {
	private int Employeeid;
	private String EmployeeName;
	private double basicsalary;
	private double grossSalary;
	private double netSalary;
	private double medical;
	private double HRA;
	private double PF;
	
	public static final double PT = 200;
	
	public Employeeinformation(int Employeeid,String EmployeeName,double basicsalary,double medical)
	{
		this.Employeeid=Employeeid;
		this.EmployeeName=EmployeeName;
		this.basicsalary=basicsalary;
		this.medical=medical;
	}
	
	public double netSalary()
	{
		double HRA=basicsalary*0.5;
		double grosssalary = HRA+basicsalary+medical;
		double PF = basicsalary*0.12;
		double net_Salary =grosssalary-(PF+PT);
		return net_Salary;
		
	}
	public void EmployeeInformation(int Employeeid,String EmployeeName,double netSalary)
	{
		System.out.println(+Employeeid);
		System.out.println(EmployeeName);
		System.out.println(netSalary);
	}
}
