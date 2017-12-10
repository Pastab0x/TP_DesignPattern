package Question2;

import Question1.Composant;
import Question1.Operande;

import java.util.NoSuchElementException;

/**
 * Created by clement on 06/12/2017.
 */
public class InfixeIterator extends OperandeIterateur {
    public InfixeIterator(Operande a){
        super(a);
    }


    public Composant next() throws NoSuchElementException{
        if (filsGauche.hasNext()){
            return filsGauche.next();
        }
        if(!passed){
            passed=true;
            return me;
        }
        if(filsDroit.hasNext()){
            return filsDroit.next();
        }
        throw new NoSuchElementException();
    }
}
