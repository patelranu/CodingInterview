package com.designpattern;

public class ObserverImpl {
	public static void main(String[] args) {
		CurrentRunRate obj=new CurrentRunRate();
		IndiaScore score =new IndiaScore();
		score.setOver(25);
		score.setRun(125);
		score.setWicket(3);
		score.registerObserver(obj);
		score.updatedScore();
	}

}
