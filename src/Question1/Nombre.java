package Question1;

import java.util.Map;

/**
 * Created by clement on 06/12/2017.
 */
public class Nombre extends Feuille{
    Integer nb;

    public Nombre(Integer nombre){
        nb=nombre;
    }

    public Integer evaluate(Map<String, Integer> contexte){
        return nb;
    }

    public String toString(){
        return nb.toString();
    }
}