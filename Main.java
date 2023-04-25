package lab3.problem1.main;

import lab3.problem1.checkexpression.*;

public class Main {

	public static void main(String[] args) {
		String input = "([[{}]])";

		CheckExpression obj1 = new CheckExpression();
		if (obj1.checkExpression(input)) {
			System.out.println("The expression " + input + " is a valid expression!");
		} else
			System.out.println("The expression " + input + " is a invalid expression!");

	}

}
