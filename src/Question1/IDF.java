package Question1;

import Question3.EvaluateVisitor;

import java.util.Map;

/**
 * Created by clement on 04/12/2017.
 */
public class IDF extends Feuille{
    String id;

    @Override
    public String toString(){
        return id;
    }

    public Integer evaluate(Map<String, Integer> contexte){
        return contexte.get(this.id);
    }

    public Integer accept(EvaluateVisitor v){
        return v.getValeur(this.id);
    }
}