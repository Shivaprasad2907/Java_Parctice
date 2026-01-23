package controlstatements;

import java.io.PrintStream;
import java.util.Scanner;

class CreateRow {
	
	PrintStream out;

	CreateRow() {
		out = new PrintStream(System.out);
	}

	void start() {
		Scanner in = new Scanner(System.in);
		CoordinateRow finalRow = new CoordinateRow();
		while (in.hasNext()) {
			Coordinate coordinate = splitCoordinate(new Scanner(in.next()));
			finalRow.addCoordinateAtTheBack(coordinate);
			printRow(finalRow);
		}
	}

	Coordinate splitCoordinate(Scanner in) {
		in.useDelimiter(",");
		int xCoordinate = in.nextInt();
		int yCoordinate = in.nextInt();
		return new Coordinate(xCoordinate, yCoordinate);
	}
	void printRow(CoordinateRow finalRow) {
		for (int i = 0; i <= finalRow.numberOfElements - 1; i++) {
			System.out.print(finalRow.coordinateArray[i].x + "," + finalRow.coordinateArray[i].y + " ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		new CreateRow().start();
	}
}