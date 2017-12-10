package Question3;

import Question1.*;

import java.util.Map;

public class EvaluateVisitor implements Visitor{
    public Integer visit(Addition a){
        return (Integer) a.getGauche().accept(this) + (Integer) a.getGauche().accept(this);
    }

    public Integer visit(Soustraction s){
        return (Integer) s.getDroite().accept(this)- (Integer) s.getGauche().accept(this);
    }

    public Integer visit(Division a) {
        try {
            return (Integer) a.getGauche().accept(this) / (Integer) a.getDroite().accept(this);
        } catch (ArithmeticException e) {
            System.out.println("Question1.Division par zéro !");
        }
        return 0;
    }

    public Integer visit(Multiplication m){
        return (Integer) m.getDroite().accept(this)* (Integer) m.getGauche().accept(this);
    }

    public Integer visit(Feuille n){
        return (Integer) n.accept(this);
    }

    public Integer getValeur(String s){
        return contexte.get(s);
    }
}