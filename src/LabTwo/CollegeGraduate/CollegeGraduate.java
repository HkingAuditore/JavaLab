package LabTwo.CollegeGraduate;

public class CollegeGraduate extends Person {
	private double _gpa;
	private int    _graduateYear;

	public CollegeGraduate(String name, int birthYear) {
		super(name, birthYear);
	}

	public CollegeGraduate(String name, int birthYear, double gpa, int graduateYear) {
		this(name, birthYear);
		this._gpa          = gpa;
		this._graduateYear = graduateYear;
	}

	//region getter & setter
	public double getGpa() {
		return _gpa;
	}

	public void setGpa(double _gpa) {
		this._gpa = _gpa;
	}

	public int getGraduateYear() {
		return _graduateYear;
	}

	public void setGraduateYear(int _graduateYear) {
		this._graduateYear = _graduateYear;
	}
	//endregion


	@Override
	public String toString() {
		String str = super.toString();
		str = str.replace('.',',');
		str += " graduated in the year " + this.getGraduateYear() + " with a GPA of " + this.getGpa() + ".";
		return str;
	}
}
