package Question1;

import Question3.EvaluateVisitor;
import Question3.Visitor;

import java.util.Map;

/**
 * Created by clement on 04/12/2017.
 */
public class Addition extends Operande{
    public Addition(Composant a, Composant b){
        super(a, b, "+");
    }

    public Integer evaluate(Map<String, Integer> contexte){
        return filsGauche.evaluate(contexte)+filsDroit.evaluate(contexte);
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}
