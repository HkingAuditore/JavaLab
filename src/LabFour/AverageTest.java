package LabFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageTest {
	static Scanner scanner = new Scanner(System.in);

	private static double tryGetNumber() throws AverageException {
		try {
			return scanner.nextDouble();
		}catch(Exception e){
			scanner.nextLine();
			throw new AverageException(1,"Error, please enter the number again.");
		}
	}

	private static void calculateAverage() throws AverageException{
		System.out.println("How many numbers do you want to enter?");
		int num = scanner.nextInt();
		if(num > 0){
			double sum = .0;
			for (int i = 0; i < num; i++){
				try {
					System.out.println("Enter number " + i);
					sum += tryGetNumber();
				}catch (AverageException e){
					System.out.println(e.getMessage());
					i--;
				}
			}
			System.out.println("The average is " + (sum / num));
		}else{
			throw new AverageException(0,"Number must be greater than 0.");
		}
	}

	public static void main(String[] args) {
		do {
			try {
				calculateAverage();
				break;
			}catch (AverageException e){
				System.out.println(e.getMessage());
			}
		}while(true);
	}
}
