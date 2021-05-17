package LabTwo.Staff.Sales;

public interface ISales {
	/** 获取销售额
	 * @return 销售额
	 */
	public double getSales();

	/**
	 * 设置销售额
	 * @param sales 销售额
	 */
	public void setSales(double sales);

	/**
	 * 获取销售提成
	 */
	public double getSalesCommission();

	/**
	 * 设置销售提成
	 * @param salesCommission 销售提成
	 */
	public void setSalesCommission(double salesCommission);


}
