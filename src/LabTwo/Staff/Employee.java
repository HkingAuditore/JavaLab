package LabTwo.Staff;

public abstract class Employee {
	private EmployeeType _employeeType;

	//region getter & setter
	public EmployeeType getEmployeeType() {
		return _employeeType;
	}

	public void setEmployeeType(EmployeeType _employeeType) {
		this._employeeType = _employeeType;
	}
	//endregion
}
