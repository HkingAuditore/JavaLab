package LabTwo.Staff;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
	Scanner scanner = new Scanner(System.in);
	private void getEmployeeType(){

	}

	private double inputDouble(String hint){
		System.out.println(hint + ":");
		return scanner.nextDouble();
	}

	private void showDouble(String hint,double num){
		System.out.println(hint + "为:" + num);
	}
}
