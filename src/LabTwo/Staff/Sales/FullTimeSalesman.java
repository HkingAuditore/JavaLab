package LabTwo.Staff.Sales;

import LabTwo.Staff.EmployeeType;
import LabTwo.Staff.FullTimeEmployee;

public class FullTimeSalesman extends FullTimeEmployee implements ISales {
	private double _salesCommission = .05;
	private double _sales;

	public FullTimeSalesman() {
		this.setEmployeeType(EmployeeType.SALES_FULL_TIME_SALESMAN);
		this.monthlyBasicSalary = 3000;

	}

	@Override
	public double getMonthlySalary() {
		return this.monthlyBasicSalary + this.getSales() * this.getSalesCommission();
	}

	@Override
	public double getSales() {
		return _sales;
	}

	@Override
	public void setSales(double sales) {
		this._sales =Math.max(0,sales);
	}

	@Override
	public double getSalesCommission() {
		return this._salesCommission;
	}

	@Override
	public void setSalesCommission(double salesCommission) {
		this._salesCommission = salesCommission;
	}
}
