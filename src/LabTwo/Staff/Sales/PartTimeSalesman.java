package LabTwo.Staff.Sales;

import LabTwo.Staff.EmployeeType;
import LabTwo.Staff.PartTimeEmployee;

public class PartTimeSalesman extends PartTimeEmployee implements ISales{
	private final double _salesCommission = .0;
	private double _sales;

	public PartTimeSalesman() {
		this._hourlyRate = 80;
		this.setEmployeeType(EmployeeType.SALES_PART_TIME_SALESMAN);
	}

	@Override
	public double getDailySalary() {
		return this.getDailyWorkingHours() * this.getHourlyRate();
	}

	@Override
	public double getSales() {
		return _sales;
	}

	@Override
	public void setSales(double sales) {
		_sales = sales;
	}

	@Override
	public double getSalesCommission() {
		return _salesCommission;
	}

	@Override
	public void setSalesCommission(double salesCommission) {
		return;
	}

}
