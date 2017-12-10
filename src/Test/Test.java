package Test;
import Question1.*;
import Question2.NodeIterator;

/**
 * Created by clement on 06/12/2017.
 */
public class Test {
    public static void main(String[] args){
        Composant test= new Addition(new Nombre(2), new Nombre(3));
        System.out.println(test);

        NodeIterator Iterateurtest= test.iterator();
        while(Iterateurtest.hasNext()){
            System.out.println(Iterateurtest.next().toString());
        }
    }
}