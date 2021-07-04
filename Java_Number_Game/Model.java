package Java_Number_Game;

// import java.util.Scanner;

public class Model {

	int min = 1;
	int max = 99;
	int secretNumber = (int) (Math.ceil(Math.random() * max - min - 1) + min);
	int countTries = 0;
	int playerNumber;
	boolean endGame;

	public void setNumber(int number) {
		playerNumber = number;
	}

	public int getNumber() {
		return playerNumber;
	}

	public int getMin() {
		return min;
	}

	public void changeDiapason() {
		if (playerNumber == secretNumber) {
			endGame = true;
		} else if (playerNumber > secretNumber) {
			max = playerNumber;
		} else {
			min = playerNumber;
		}

	}
}
