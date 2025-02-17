package Day8;

public class Gamestart {

	public static void main(String[] args) {
		IceSports figureSkating = new FigureSkating();
		IceSports speedSkating = new SpeedSkating();
		IceSports iceHockey = new IceHockey();
		IceSports curling = new Curling();
		
		figureSkating.startGame();
		speedSkating.startGame();
		iceHockey.startGame();
		curling.startGame();
		

	}

}
