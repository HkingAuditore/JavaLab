package LabFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageTest {
	static Scanner scanner = new Scanner(System.in);
	private static void calculateAverage() throws Exception {
		System.out.println("你想计算多少个数的平均值？");
		int num = scanner.nextInt();
		if(num > 0){
			List<Double> numList =new ArrayList<Double>();

		}else{
			throw new Exception("必须大于零！");
		}
	}
	public static void main(String[] args) {

		try {
		}catch (Exception e){

		}
	}
}
