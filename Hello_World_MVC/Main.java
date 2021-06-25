package Hello_World_MVC;

public class Main {
	public static void main(String args[]) {
		System.out.println(View.INPUT_HELLO);
		Controller.firstStep();
		Controller.secondStep();
		Model.makeSentence(Controller.firstWord, Controller.secondWord);
	}
}
