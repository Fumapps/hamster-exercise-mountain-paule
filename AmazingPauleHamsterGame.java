import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import java.io.IOException;

/**
 * Beschreiben Sie hier die Klasse AmazingPauleHamsterGame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AmazingPauleHamsterGame extends SimpleHamsterGame{

    
    AmazingPauleHamsterGame(){  
        try {
            game.initialize("/territories/territory-amazingpaule-ub7.ter");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        game.displayInNewGameWindow();          
    }
    
    void passTheMaze() {
    
    }
        
}
