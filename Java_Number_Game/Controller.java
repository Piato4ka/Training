package Java_Number_Game;

import java.util.Scanner;

public class Controller {

	Model model = new Model();
	View view = new View();

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	void processUser() {
		if (rightInput()) {
			model.changeDiapason();
			System.out.println("You inputed: " + model.playerNumber);
			helpToFind ();
		} else {
			System.out.println(view.WRONG_INPUT_INT_DATA);
		}
	}

	void helpToFind () {
		if (model.playerNumber > model.secretNumber) {
			view.printMessage(view.LESS_NUMBER, model.min, model.max);
			
		}
		else if (model.playerNumber < model.secretNumber) {
			view.printMessage(view.GREATER_NUMBER, model.min, model.max);
		}
		else if (model.playerNumber == model.secretNumber) {
			view.printMessage(view.VIN);
			System.out.println("You made it in " + model.countTries + " steps.");
		}
	}

		
	boolean rightInput() {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			model.setNumber(sc.nextInt());
			if (model.getNumber() > model.max) {
				return false;
			} else if (model.getNumber() < model.min) {
				return false;
			} else {
				model.countTries++;
				return true;
			}
		} else {
			return false;
		}
	}
}
