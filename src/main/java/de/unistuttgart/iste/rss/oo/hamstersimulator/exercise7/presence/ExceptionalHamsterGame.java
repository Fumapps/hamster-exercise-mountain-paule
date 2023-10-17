package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise7.presence;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Beschreiben Sie hier die Klasse LoopingPaule.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ExceptionalHamsterGame extends SimpleHamsterGame {


    protected void run() {
        game.displayInNewGameWindow();
        File terFile = new File ("territories/territory-ub6.ter");
        try {
        	InputStream targetStream = new FileInputStream(terFile);
            game.initialize(targetStream);
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }
   
    
}
