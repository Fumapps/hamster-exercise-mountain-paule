import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import java.io.IOException;
/**
 * Beschreiben Sie hier die Klasse LoopingPaule.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ExceptionalHamsterGame extends SimpleHamsterGame {

    public void main() {
        doRun();
    }
    

    protected void run() {
        game.displayInNewGameWindow();
        try {
            game.initialize("/territories/territory-udb6.ter");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }
   
    void multiMove (int numberOfSteps) {

    }
    
    void spreadGrainsInCurrentDirection() {

    }
    
    void moveToNextWall() {
        while(true){
            if(paule.frontIsClear()){
                paule.move();
            } else {
                paule.turnLeft();
            }
        }
    }
    
}
