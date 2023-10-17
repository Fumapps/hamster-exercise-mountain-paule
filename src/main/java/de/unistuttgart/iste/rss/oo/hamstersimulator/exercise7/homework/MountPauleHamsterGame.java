package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise7.homework;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

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
		this.loadTerritoryFromResourceFile("/territories/territory-mountpaule-ub7.ter");
		this.displayInNewGameWindow();
	}
	
	@Override
	protected void run() {
		game.startGame();
		climbTheMountain();
		game.stopGame();
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
