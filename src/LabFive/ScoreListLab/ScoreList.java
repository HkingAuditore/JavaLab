package LabFive.ScoreListLab;

import java.util.ArrayList;

public class ScoreList {
	private final ArrayList<Double> _scoreList = new ArrayList<Double>();
	private double _averageScore;

	public void addScore(double score) throws ScoreListException {
		if(score < 0){
			finalizeScore();
			throw new ScoreListException("Score must not be negative");
		}
		_scoreList.add(score);
	}

	private void finalizeScore(){
		_averageScore = _scoreList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	}

	public ArrayList<Double> getScoreList() {
	    return _scoreList;
	}

	public double getAverageScore() {
		return _averageScore;
	}

	public double getDeviation(int index){
		return _scoreList.get(index) - getAverageScore();
	}
	public double getDeviation(double score){
		return score - getAverageScore();
	}

}
