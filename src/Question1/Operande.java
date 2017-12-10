package Question1;

import Question2.NodeIterator;
import Question2.OperandeIterateur;
import Question3.EvaluateVisitor;

/**
 * Created by clement on 06/12/2017.
 */
public abstract class Operande extends Composite{
    Composant filsGauche;
    Composant filsDroit;
    String signe;

    public Operande(Composant a, Composant b, String string){
        filsGauche=a;
        filsDroit=b;
        signe = string;
    }

    public String toString(){
        return "("+filsGauche.toString()+ signe + filsDroit.toString()+")";
    }

    public NodeIterator iterator(){
        return new OperandeIterateur(this);
    }

    public Composant getGauche(){
        return filsGauche;
    }

    public Composant getDroite(){
        return filsDroit;
    }
}
