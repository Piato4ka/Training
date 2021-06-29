package Java_Number_Game;

public class Main {
	public static void main(String args[]) {	
		Model model = new Model(); 
		View view = new View();
		Controller controller = new Controller(model, view);
		
		view.printMessage(view.INPUT_YOUR_NUMBER + "from " + model.min + " to " + model.max + ": ");
		
		while (!model.endGame) {
			controller.processUser();
		}
	}
}

