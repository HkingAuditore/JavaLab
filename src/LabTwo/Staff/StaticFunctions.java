package LabTwo.Staff;

public class StaticFunctions {
	public static <T extends Comparable<T>> T clamp(T val, T min, T max) {
		if (val.compareTo(min) < 0) return min;
		else if (val.compareTo(max) > 0) return max;
		else return val;
	}
}
