package entities;

import utilities.MyStack;

public class User {
	private String name;
	private MyStack<Double> stackGrades;

    public User(String name) {
    	this.name = name;
    	stackGrades = new MyStack<>();
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void addGrade(double n) {
    	stackGrades.push(n);
    }
    
    public void displayGrades() {
    	System.out.println(stackGrades);
    }
}
