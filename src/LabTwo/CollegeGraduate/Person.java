package LabTwo.CollegeGraduate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
	private String _name;
	private int _birthYear;

	public Person(String _name, int _birthYear) {
		this._name      = _name;
		this._birthYear = _birthYear;
	}

	//region getter & setter
	public int getBirthYear() {
		return _birthYear;
	}

	public void setBirthYear(int birthYear) {
		this._birthYear = birthYear;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}
	//endregion


	@Override
	public String toString() {
		return this.getName() + ", " + (Calendar.getInstance().get(Calendar.YEAR) - this.getBirthYear()) + " years old.";
	}
}
