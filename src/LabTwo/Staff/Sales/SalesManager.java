package LabTwo.Staff.Sales;

import LabTwo.Staff.EmployeeType;
import LabTwo.Staff.FullTimeEmployee;

public class SalesManager extends FullTimeEmployee implements ISales{
	private double _salesCommission = .01;
	private double _salesTotal;

	public SalesManager() {
		this.setEmployeeType(EmployeeType.SALES_SALES_MANAGER);
		this.monthlyBasicSalary = 5000;
	}

	@Override
	public double getMonthlySalary() {
		return this.monthlyBasicSalary + this.getSales() * this.getSalesCommission();
	}

	@Override
	public double getSales() {
		return _salesTotal;
	}

	@Override
	public void setSales(double sales) {
		this._salesTotal = Math.max(0,sales);
	}

	@Override
	public double getSalesCommission() {
		return _salesCommission;
	}

	@Override
	public void setSalesCommission(double salesCommission) {
		this._salesCommission = salesCommission;
	}
}
