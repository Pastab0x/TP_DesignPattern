package Question1;

import java.util.Map;

/**
 * Created by clement on 04/12/2017.
 */
public class Division extends Operande{
    public Division(Composant a, Composant b){
        super(a, b, "/");
    }

    public Integer evaluate(Map<String, Integer> contexte){
        try {
            return filsGauche.evaluate(contexte)/filsDroit.evaluate(contexte);
        } catch (ArithmeticException e) {
            System.out.println("Question1.Division par zéro !");
        }
        return 0;
    }
}