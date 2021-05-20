package com.snakeandladder;

public class SnakeAndLadder {
	public static int position = 0;
	public static int count = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder");
		System.out.println(position);

		while (position != 100) {
			count++;
			int nextPosition = (int) (Math.random() * 6) + 1;
			int decision = (int) (Math.random() * 3);
			switch (decision) {
			case 1:
				position += nextPosition;
				break;
			case 2:
				position -= nextPosition;
				if (position < 0)
					position = 0;
				break;
			default:
				position += 0;

			}
			if (position > 100) {
				position -= nextPosition;
			}
			System.out.println(position);

		}
		System.out.println("You win after : " + count);

	}
}