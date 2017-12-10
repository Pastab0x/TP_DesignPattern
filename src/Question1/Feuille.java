package Question1;

import Question2.FeuilleIterateur;
import Question2.NodeIterator;
import Question3.Visitor;

/**
 * Created by clement on 04/12/2017.
 */
public abstract class Feuille extends Composant{
    public NodeIterator iterator(){
        return new FeuilleIterateur(this);
    }
    public abstract Object accept(Visitor v);
}