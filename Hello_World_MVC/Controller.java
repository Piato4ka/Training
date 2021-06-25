package Hello_World_MVC;

import java.util.Scanner;

public class Controller {

	static Scanner sc = new Scanner(System.in);
	static String firstWord;
	static String secondWord;

	static public void firstStep() {
		String FirstInput = sc.next();
		if (FirstInput.equals("Hello")) {
			System.out.println(View.INPUT_WORLD);
			firstWord = FirstInput;
		} else {
			System.out.println(View.WRONG_INPUT);
			firstStep();
		}
	}

	static public void secondStep() {
		String SecondInput = sc.next();
		if (SecondInput.equals("World")) {
			secondWord = SecondInput;
		} else {
			System.out.println(View.WRONG_INPUT);
			secondStep();
		}
	}
}
