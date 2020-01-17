package ua.lviv.iot.FirstJavaLab;

public class ComputerGame {

	public static final int SIZE_OF_OBJECTS = 4;

	private String nameOfComputerGame;

	private int numberOfCharacters;

	private double averageOfComments;

	private String typeOfLvl;

	private int systemRequirmentsOfGame;

	public static int priceOfComputerGame;

	protected int downloadsFromTorrent;

	protected int downloadsFromWindows;

	public String getNameOfComputerGame() {
		return nameOfComputerGame;
	}

	public void setNameOfComputerGame(String nameOfComputerGame) {
		this.nameOfComputerGame = nameOfComputerGame;
	}

	public int getNumberOfCharacters() {
		return numberOfCharacters;
	}

	public void setNumberOfCharacters(int numberOfCharacters) {
		this.numberOfCharacters = numberOfCharacters;
	}

	public double getAverageOfComments() {
		return averageOfComments;
	}

	public void setAverageOfComments(double averageOfComments) {
		this.averageOfComments = averageOfComments;
	}

	public String getTypeOfLvl() {
		return typeOfLvl;
	}

	public void setTypeOfLvl(String typeOfLvl) {
		this.typeOfLvl = typeOfLvl;
	}

	public int getSystemRequirmentsOfGame() {
		return systemRequirmentsOfGame;
	}

	public void setSystemRequirmentsOfGame(int systemRequirmentsOfGame) {
		this.systemRequirmentsOfGame = systemRequirmentsOfGame;
	}

	public ComputerGame(String nameOfComputerGame, int numberOfCharacters, double averageOfComments, String typeOfLvl,
			int systemRequirmentsOfGame, int downloadsFromTorrent, int downloadsFromWindows) {
		this.nameOfComputerGame = nameOfComputerGame;
		this.numberOfCharacters = numberOfCharacters;
		this.averageOfComments = averageOfComments;
		this.typeOfLvl = typeOfLvl;
		this.systemRequirmentsOfGame = systemRequirmentsOfGame;
		this.downloadsFromTorrent = downloadsFromTorrent;
		this.downloadsFromWindows = downloadsFromWindows;
	}

	public ComputerGame(String nameOfGame, int numberOfCharacters, double averageOfComments, String typeOfLvl) {
		this(nameOfGame, numberOfCharacters, averageOfComments, typeOfLvl, 0, 0, 0);
	}

	public ComputerGame() {
		this(null, 0, 0, null, 0, 0, 0);
	}

	@Override
	public String toString() {
		return "ComputerGame [nameOfComputerGame=" + nameOfComputerGame + ", numberOfCharacters=" + numberOfCharacters
				+ ", averageOfComments=" + averageOfComments + ", typeOfLvl=" + typeOfLvl + ", systemRequirmentsOfGame="
				+ systemRequirmentsOfGame + ", downloadsFromTorrent=" + downloadsFromTorrent + ", downloadsFromWindows="
				+ downloadsFromWindows + "]";
	}

	public static String printStaticPriceOfComputerGame() {
		return "static priceOfComputerGame=" + priceOfComputerGame;
	}

	public String printPriceOfComputerGame() {
		return "priceOfComputerGame=" + priceOfComputerGame;
	}

	public void resetValues(String nameOfComputerGame, int numberOfCharacters, double averageOfComments,
			String typeOfLvl, int systemRequirmentsOfGame, int downloadsFromTorrent, int downloadsFromWindows) {
		this.nameOfComputerGame = nameOfComputerGame;
		this.numberOfCharacters = numberOfCharacters;
		this.averageOfComments = averageOfComments;
		this.typeOfLvl = typeOfLvl;
		this.systemRequirmentsOfGame = systemRequirmentsOfGame;
		this.downloadsFromTorrent = downloadsFromTorrent;
		this.downloadsFromWindows = downloadsFromWindows;
	}
}
