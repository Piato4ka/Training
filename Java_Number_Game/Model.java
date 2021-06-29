package Java_Number_Game;

// import java.util.Scanner;

public class Model {

	int secretNumber = (int) (Math.random() * 102) + 0;
	int min = 0;
	int max = 100;
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
	// в контрoллере

	void changeDiapason() { 
		if (playerNumber > secretNumber) {
			max = playerNumber;
		} else if (playerNumber < secretNumber) {
			min = playerNumber;
		} else if (playerNumber == secretNumber) {
			endGame = true;
		}
	}
}
