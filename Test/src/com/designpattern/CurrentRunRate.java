package com.designpattern;

public class CurrentRunRate implements Observer {
	int run;
	int over;
	int wicket;

	@Override
	public void update(int run, int over, int wicket) {
		this.run=run;
		this.over=over;
		this.wicket=wicket;
		displayCurrentRunRate(this.run,this.over,this.wicket);
	}

	private void displayCurrentRunRate(int run, int over, int wicket) {
    System.out.println("run :" +run);
    System.out.println("over :" +over);
    System.out.println("wicket :" +wicket);
	}

	
	
	

}
