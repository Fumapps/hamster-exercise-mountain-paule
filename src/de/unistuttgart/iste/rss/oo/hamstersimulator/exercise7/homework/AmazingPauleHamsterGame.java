package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise7.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



/**
 * Beschreiben Sie hier die Klasse AmazingPauleHamsterGame.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AmazingPauleHamsterGame extends SimpleHamsterGame {


	
	AmazingPauleHamsterGame() {
		game.displayInNewGameWindow();
		File terFile = new File("territories/territory-amazingpaule-ub7.ter");
		try {
			InputStream targetStream = new FileInputStream(terFile);
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}

		game.displayInNewGameWindow();
	}
	
	@Override 
	protected void run() {
		passTheMaze();
	}
	
	

	void passTheMaze() {

	}
	
	public static void main(String args[]) {
		AmazingPauleHamsterGame game = new AmazingPauleHamsterGame();
		game.doRun();
	}

}
