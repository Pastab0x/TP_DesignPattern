package Question2;

import Question1.*;

import java.util.NoSuchElementException;

/**
 * Created by clement on 06/12/2017.
 */
public class OperandeIterateur implements NodeIterator{
    public boolean passed;
    public NodeIterator filsGauche;
    public NodeIterator filsDroit;
    public Composant me;

    public OperandeIterateur(Operande a){
        me=a;
        passed=false;
        filsGauche= a.getGauche().iterator();
        filsDroit=a.getDroite().iterator();
    }

    public boolean hasNext(){
        return filsDroit.hasNext()|| !passed || filsGauche.hasNext();
    }

    public Composant next(){
        return new Nombre(3);
    }
}
