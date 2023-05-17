package application;

import java.util.Locale;

import entities.User;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		User user = new User("Cavalcante");
		
		user.addGrade(5.5);
		user.addGrade(8.9);
		user.addGrade(2.3);
		
		user.displayGrades();
	}

}
