package Question2;

import Question1.Composant;
import Question1.Operande;

import java.util.NoSuchElementException;

/**
 * Created by clement on 06/12/2017.
 */
public class PrefixeIterator extends OperandeIterateur{
    public PrefixeIterator(Operande a){
        super(a);
    }


    public Composant next2() throws NoSuchElementException {
        if(!passed){
            passed=true;
            return me;
        }
        if (filsGauche.hasNext()){
            return filsGauche.next();
        }
        if(filsDroit.hasNext()){
            return filsDroit.next();
        }
        throw new NoSuchElementException();
    }
}
