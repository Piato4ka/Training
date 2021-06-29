package Java_Number_Game;

public class View {

	public final String INPUT_YOUR_NUMBER = "Try to gess number. Input your number ";
    public final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please: ";
    public final String GREATER_NUMBER = "Greater nuber, try again from ";
    public final String LESS_NUMBER = "Less nuber, try again from ";
    public final String VIN = "It is a VICTORY!";
    
    
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessage(String message, int min, int max){
        System.out.println(message + min + " to " + max);
    }
}
