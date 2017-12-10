package Question3;

import Question1.*;

public class StringVisitor implements Visitor{
    public String visit(Addition a){
        return (String) a.getGauche().accept(this) + (String) a.getGauche().accept(this)+"+";
    }

    public String visit(Soustraction s){
        return (String) s.getDroite().accept(this)+ (String) s.getGauche().accept(this)+"-";
    }

    public String visit(Division a) {
        try {
            return (String) a.getGauche().accept(this) + (String) a.getDroite().accept(this)+"/";
        } catch (ArithmeticException e) {
            System.out.println("Question1.Division par zéro !");
        }
        return "";
    }

    public String visit(Multiplication m){
        return (String) m.getDroite().accept(this)+ (String) m.getGauche().accept(this)+"*";
    }

    public String visit(Feuille n){
        return (String) n.accept(this);
    }

    public String getValeur(String s){
        return contexte.get(s).toString();
    }
}