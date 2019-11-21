package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise7.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;



/**
 * Beschreiben Sie hier die Klasse MountPauleHamsterGame.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MountPauleHamsterGame extends SimpleHamsterGame {

	MountPauleHamsterGame() {
		File terFile = new File("territories/territory-mountpaule-ub7.ter");
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
		climbTheMountain();
	}

	void climbTheMountain() {

	}

	void climbUp() {

	}
	
	public static void main(String args[]) {
		MountPauleHamsterGame game = new MountPauleHamsterGame();
		game.doRun();
	}


}
