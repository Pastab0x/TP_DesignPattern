package Question2;

import Question1.Composant;
import Question1.Operande;

import java.util.NoSuchElementException;

/**
 * Created by clement on 06/12/2017.
 */
public class PostfixeIterator extends OperandeIterateur {
    public PostfixeIterator(Operande a){
        super(a);
    }


    public Composant next2() throws NoSuchElementException {
        if (filsGauche.hasNext()){
            return filsGauche.next();
        }
        if(filsDroit.hasNext()){
            return filsDroit.next();
        }
        if(!passed){
            passed=true;
            return me;
        }
        throw new NoSuchElementException();
    }
}
