package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.Employeeinformation;

class EmployeeinformationTest {
	Employeeinformation employee;
	@BeforeEach
	void setUp()
	{
		employee=new Employeeinformation(157691,"Devika",13000,2500);
	}
	@Test
	void testnetSalary()
	{
		assertEquals(20240.0,employee.netSalary(),0.03);
	}
	@Test
	void testCalculateNetSalary() {
		assertEquals(20240.0, employee.netSalary(), 0.03);
	}
	
	@AfterEach
	void tearDown() {
		employee = null;
	}
}
