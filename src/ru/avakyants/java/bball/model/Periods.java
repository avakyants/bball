package ru.avakyants.java.bball.model;

public enum Periods {
	
	Q1(1), Q2(2), Q3(3), Q4(4), OT1(5), OT2(6), OT3(7), OT4(8), OT5(9), OT6(10);
	
	int value;
	
	Periods(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

}
