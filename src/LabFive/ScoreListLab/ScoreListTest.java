package LabFive.ScoreListLab;

import java.util.Scanner;

public class ScoreListTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program reads scores and shows");
		System.out.println("how much each differs from the average.");
		ScoreList scoreList = new ScoreList();

		while(true){
			System.out.println("Enter scores:");
			try {
				scoreList.addScore(scanner.nextDouble());
			}catch (ScoreListException e) {
			    break;
			}catch (Exception e) {
				return;
			}
		}

		System.out.println("Average of the " + scoreList.getScoreList().size() + " scores = " + String.format("%.2f", scoreList.getAverageScore()) );
		System.out.println("The scores are:" );

		for (int i = 0;i < scoreList.getScoreList().size() ;i++){
			System.out.println(scoreList.getScoreList().get(i) + " differs from average by " + String.format("%.2f", scoreList.getDeviation(i)));
		}
	}
}
