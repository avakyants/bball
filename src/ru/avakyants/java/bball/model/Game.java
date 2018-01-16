package ru.avakyants.java.bball.model;

public class Game {
	private int id;
	private String visitor;
	private String home;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setVisitor(String v) {
		this.visitor = v;
	}
	
	public String getVisitor() {
		return visitor;
	}
	
	public void setHome(String h) {
		this.home = h;
	}
	
	public String getHome() {
		return home;
	}
}
