package Question1;

import Question3.EvaluateVisitor;

import java.util.Map;

/**
 * Created by clement on 04/12/2017.
 */
public class Multiplication extends Operande {
    public Multiplication(Composant a, Composant b){
        super(a, b, "*");
    }

    public Integer evaluate(Map<String, Integer> contexte){
        return filsGauche.evaluate(contexte)+filsDroit.evaluate(contexte);
    }
}
