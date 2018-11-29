import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import java.io.IOException;
/**
 * Beschreiben Sie hier die Klasse CustomHamsterGame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HungryPaule extends SimpleHamsterGame{

    
    public HungryPaule() {
        game.displayInNewGameWindow();
        try {
            game.initialize("/territories/territory-ub7.ter");
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
    }
    
  
    @Override
    protected void run() {
        
    }
    
    public void collectEverything(){
        for(int i=0; i<4; i++){
            paule.move();
        }
        paule.pickGrain();
        paule.move();
        // turn around
        for(int i=0; i<3; i++){
            paule.turnLeft();
        }
        paule.move();
        for(int i=0; i<3; i++){
            paule.turnLeft();
        }
        for(int i=0; i<5; i++){
            paule.move();
        }
        paule.turnLeft();
        paule.move();
        paule.turnLeft();
        // pick grains for the whole row
        for(int i=0; i<5; i++){
            if(paule.grainAvailable()){
                paule.pickGrain();
            }
            paule.move();
        }
        // enter next row and turn to collect the new grains
        for(int i=0; i<3; i++){
            paule.turnLeft();
        }
        paule.move();
        for(int i=0; i<3; i++){
            paule.turnLeft();
        }
        paule.move();
        paule.pickGrain();
        for(int i=0; i<4; i++){
            paule.move();
        }
        paule.turnLeft();
        paule.move();
        paule.turnLeft();
        // eat all grains of the pre-last row 
        for(int i=0; i<5; i++){
            while(paule.grainAvailable()){
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
        for(int i=0; i<5; i++){
            while(paule.grainAvailable()){
                paule.pickGrain();
            }
            paule.move();
        }
    }
}
