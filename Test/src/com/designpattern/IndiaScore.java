package com.designpattern;

import java.util.ArrayList;
import java.util.List;

public class IndiaScore implements Cricket {
	private int run;
	private int over;
	private int wicket;
	public List<Observer> list;
	
	public IndiaScore() {
		list=new ArrayList<>();
	}
	public int getRun() {
		return run;
	}
	public int getOver() {
		return over;
	}
	public int getWicket() {
		return wicket;
	}
		
	public void setRun(int run) {
		this.run = run;
	}
	public void setOver(int over) {
		this.over = over;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	@Override
	public void registerObserver(Observer o) {
		list.add(o);
	}
	
	public void updatedScore(){
		 notifyUpdateToOberver();
	}
	
	private void notifyUpdateToOberver() {
		
		for(Observer o:list){
			o.update(run, over, wicket);
		}
	}
	

}
