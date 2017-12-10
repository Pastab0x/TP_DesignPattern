package Question1;

import java.util.Map;

/**
 * Created by clement on 04/12/2017.
 */
public class Soustraction extends Operande{
    public Soustraction(Composant a, Composant b){
        super(a, b, "-");
    }

    public Integer evaluate(Map<String, Integer> contexte){
        return filsGauche.evaluate(contexte)+filsDroit.evaluate(contexte);
    }
}
