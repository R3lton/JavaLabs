package ua.lviv.iot.FirstJavaLab;

public class VideoGameInformation {

	public static void main(String[] args) {
		ComputerGame.priceOfComputerGame = 0;
		ComputerGame firstGame = new ComputerGame();
		ComputerGame secondGame = new ComputerGame("Unreal", 15, 3.5, "Hard");
		ComputerGame thirdGame = new ComputerGame("God Of War", 120, 5.0, "Hard", 5, 1243, 956);
		System.out.println(firstGame.toString());
		System.out.println("---------------------------------------------");
		System.out.println(secondGame.toString());
		System.out.println("---------------------------------------------");
		System.out.println(thirdGame.toString());
		System.out.println("---------------------------------------------");
		System.out.println(thirdGame.printPriceOfComputerGame());
		System.out.println("---------------------------------------------");
		System.out.println(ComputerGame.printStaticPriceOfComputerGame());
		System.out.println("---------------------------------------------");

		ComputerGame[] computerGamesArray = new ComputerGame[ComputerGame.SIZE_OF_OBJECTS];
		for (int count = 0; count < ComputerGame.SIZE_OF_OBJECTS; count++) {
			computerGamesArray[count] = new ComputerGame("New Game", 94, 4.5, "Hard", 5, 323, 521);
		}
		for (ComputerGame computerGame : computerGamesArray) {
			System.out.println(computerGame.toString());
		}

	}

}
