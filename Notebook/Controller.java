package Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
	Model model = new Model();
	View view = new View();
	
	Controller (Model model, View view){
		model = this.model;
		view = this.view;
	}
	
	public void dod () {
		
	}
	public void processUser() {
		model.setName(registerName());
		model.setLogin(registerLogin());
	}
	
	public String registerName () {
		view.printMessage(view.INPUT_NAME);
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (Validator.rightInput(input, Validator.NAME_PATTERN)) {
			return input;
		} else {
			view.printMessage(view.WRONG_INPUT);
			registerName ();
			return "";
		}
	}
	
	public String registerLogin () {
		view.printMessage(view.INPUT_LOGIN);
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (Validator.rightInput(input, Validator.LOGIN_PATTERN)) {
			return input;
		} else {
			view.printMessage(view.WRONG_INPUT);
			registerLogin ();
			return "";
		}
	}
}

