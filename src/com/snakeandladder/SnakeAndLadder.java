package com.snakeandladder;

public class SnakeAndLadder {
	public static int player1Position = 0;
	public static int player2Position = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder");
		while (player1Position != 100 && player2Position != 100) {

			int player1Turn = play(player1Position);
			player1Position = player1Turn;
			int player2Turn = play(player2Position);
			player2Position = player2Turn;

		}
		if (player1Position == 100)
			System.out.println("Player1 wins");
		else
			System.out.println("Player2 wins");

	}

	public static int play(int player_position) {
		int options = (int) (Math.random() * 3);
		int dice = (int) (Math.random() * 6) + 1;
		int nextPosition = player_position;
		switch (options) {
		case 1:
			nextPosition += dice;
			if (nextPosition > 100) {
				nextPosition -= dice;
			}
			while (options == 1) {
				dice = (int) (Math.random() * 6) + 1;
				options = (int) (Math.random() * 3);
				nextPosition += dice;
				if (nextPosition > 100)
					break;
			}
			if (options == 2) {
				nextPosition -= dice;
				if (nextPosition < 0) {
					nextPosition = 0;
				}
			}
			break;
		case 2:
			nextPosition -= dice;
			if (nextPosition < 0) {
				nextPosition = 0;
			}
			break;
		default:
			nextPosition += 0;

		}
		return nextPosition;
	}
}