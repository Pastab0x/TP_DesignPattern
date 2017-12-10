package Question2;

import Question1.Composant;
import Question1.Feuille;

import java.util.NoSuchElementException;

/**
 * Created by clement on 06/12/2017.
 */
public class FeuilleIterateur implements NodeIterator {
    private Feuille leaf;
    private boolean passed;

    public FeuilleIterateur(Feuille leaf){
        this.leaf=leaf;
        passed=false;
    }

    public Composant next()throws NoSuchElementException{
        if(!passed){
            passed=true;
            return leaf;
        }else throw new NoSuchElementException();
    }

    public boolean hasNext(){
        return !passed;
    }
}