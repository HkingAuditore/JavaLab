package LabTwo.Staff;

public abstract class PartTimeEmployee extends Employee{
	/**
	 * 日工作时长
	 */
	protected double _dailyWorkingHours;

	protected double _hourlyRate;


	/** 获取日薪
	 * @return 日薪
	 */
	public abstract double getDailySalary();

	//region getter & setter
	public double getDailyWorkingHours() {
		return _dailyWorkingHours;
	}
	public void setDailyWorkingHours(double _dailyWorkingHours) {
		this._dailyWorkingHours = _dailyWorkingHours;
	}

	public double getHourlyRate() {
		return _hourlyRate;
	}

	public void setHourlyRate(double _hourlyRate) {
		this._hourlyRate = _hourlyRate;
	}
	//endregion
}
