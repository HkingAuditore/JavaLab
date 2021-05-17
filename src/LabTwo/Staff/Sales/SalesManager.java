package LabTwo.Staff.Sales;

import LabTwo.Staff.EmployeeType;
import LabTwo.Staff.FullTimeEmployee;

public class SalesManager extends FullTimeEmployee implements ISales{
	private double _salesCommission = .05;
	private double _sales;

	public SalesManager(double salesCommission, double sales) {
		this._salesCommission = salesCommission;
		this._sales           = sales;
		this.setEmployeeType(EmployeeType.SALES_SALES_MANAGER);
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
		this._sales = sales;
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
