package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise7.presence;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * Beschreiben Sie hier die Klasse CustomHamsterGame.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HungryPaule extends SimpleHamsterGame {

	public HungryPaule() {
		game.displayInNewGameWindow();
		File terFile = new File("territories/territory-ub7.ter");
		try {
			InputStream targetStream = new FileInputStream(terFile);
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected void run() {
		collectEverything();
	}

	public void collectEverything() {
		for (int i = 0; i < 4; i++) {
			paule.move();
		}
		paule.pickGrain();
		paule.move();
		// turn around
		for (int i = 0; i < 3; i++) {
			paule.turnLeft();
		}
		paule.move();
		for (int i = 0; i < 3; i++) {
			paule.turnLeft();
		}
		for (int i = 0; i < 5; i++) {
			paule.move();
		}
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		// pick grains for the whole row
		for (int i = 0; i < 5; i++) {
			if (paule.grainAvailable()) {
				paule.pickGrain();
			}
			paule.move();
		}
		// enter next row and turn to collect the new grains
		for (int i = 0; i < 3; i++) {
			paule.turnLeft();
		}
		paule.move();
		for (int i = 0; i < 3; i++) {
			paule.turnLeft();
		}
		paule.move();
		paule.pickGrain();
		for (int i = 0; i < 4; i++) {
			paule.move();
		}
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		// eat all grains of the pre-last row
		for (int i = 0; i < 5; i++) {
			while (paule.grainAvailable()) {
				paule.pickGrain();
			}
			paule.move();
		}
		// collect the last row
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		for (int i = 0; i < 5; i++) {
			while (paule.grainAvailable()) {
				paule.pickGrain();
			}
			paule.move();
		}
	}
}
