package LabTwo.Staff.Sales;

import LabTwo.Staff.EmployeeType;
import LabTwo.Staff.FullTimeEmployee;

public class FullTimeSalesman extends FullTimeEmployee implements ISales {
	private double _salesCommission = .05;
	private double _sales;

	public FullTimeSalesman(double salesCommission, double sales) {
		this._salesCommission = salesCommission;
		this._sales           = sales;
		this.setEmployeeType(EmployeeType.SALES_FULL_SALESMAN);
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
		this._sales =sales;
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
