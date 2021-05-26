package LabTwo.Staff;

import LabTwo.Staff.Sales.FullTimeSalesman;
import LabTwo.Staff.Sales.PartTimeSalesman;
import LabTwo.Staff.Sales.SalesManager;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
	private static final Scanner scanner = new Scanner(System.in);
	private static Employee employee;

	private static void generateEmployee() throws Exception {
		System.out.println("请输入职位:");
		String employeeTypeStr = scanner.nextLine();
//		System.out.println(employeeTypeStr);
		switch (employeeTypeStr) {
			case "销售经理":
				employee = new SalesManager();
				break;
			case "专职销售员":
				employee = new FullTimeSalesman();
				break;
			case "兼职销售员":
				employee = new PartTimeSalesman();
				break;
			default:
				throw new Exception("未输入正确的职位");
		}
	}

	private static double inputDouble(String hint) {
		System.out.println(hint + ":");
		return scanner.nextDouble();
	}

	private static void showDouble(String hint, double num) {
		System.out.println(hint + "为:" + num);
	}

	public static void main(String[] args) {
		try {
			generateEmployee();
			switch (employee.getEmployeeType()) {
				case SALES_FULL_TIME_SALESMAN -> {
					FullTimeSalesman fullTimeSalesman = (FullTimeSalesman) employee;
					fullTimeSalesman.setSales(inputDouble("请输入当月销售额"));
					showDouble("月薪", fullTimeSalesman.getMonthlySalary());
				}
				case SALES_SALES_MANAGER -> {
					SalesManager salesmanManager = (SalesManager) employee;
					salesmanManager.setSales(inputDouble("请输入当月销售总额"));
					showDouble("月薪", salesmanManager.getMonthlySalary());

				}
				case SALES_PART_TIME_SALESMAN -> {
					var partTimeSalesman = (PartTimeSalesman) employee;
					partTimeSalesman.setDailyWorkingHours(inputDouble("请输入工作小时数"));
					showDouble("日薪", partTimeSalesman.getDailySalary());

				}
			}

		} catch (Exception e) {
			return;
		}

	}
}
