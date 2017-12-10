package Question1;

import Question2.NodeIterator;
import Question3.EvaluateVisitor;
import Question3.Visitable;
import Question3.Visitor;

import java.util.Map;

/**
 * Created by clement on 04/12/2017.
 */
public abstract class Composant implements Visitable{
    private Composant[] children;
    private Composite valeur;

    @Override
    public String toString() {
        return children[0].toString() + valeur.toString() + children[1].toString();
    }

    public abstract Integer evaluate(Map<String, Integer> contexte);

    public abstract NodeIterator iterator();

    public abstract Object accept(Visitor v);

}