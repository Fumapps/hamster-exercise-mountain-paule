import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import java.io.IOException;

/**
 * Beschreiben Sie hier die Klasse MountPauleHamsterGame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MountPauleHamsterGame extends SimpleHamsterGame{

    MountPauleHamsterGame(){
        try {
            game.initialize("/territories/territory-mountpaule-ub7.ter");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        game.displayInNewGameWindow();                       
    }
    
    void climbTheMountain() {
    
    }
    
    void climbUp() {
        
    }
    
}
