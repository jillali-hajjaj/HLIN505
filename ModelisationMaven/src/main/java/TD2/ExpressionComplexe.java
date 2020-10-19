package TD2;

import java.util.Objects;

public class ExpressionComplexe extends Expression {
    private char op;
    private Expression a;
    private Expression b;

    public ExpressionComplexe(char op, Expression a, Expression b) {
        this.op = op;
        this.a = a;
        this.b = b;
    }



    @Override
    public int hashCode() {
        return Objects.hash(op, a, b);
    }

    public double eval(){
        double res;
        switch (op){
            case '+': res = a.eval() + b.eval(); break;
            case '-': res = a.eval() - b.eval();break;
            case '*': res = a.eval() * b.eval();break;
            case '/': res = a.eval() / b.eval();
                break;
            default:
                throw new IllegalStateException("Opérateur inconnu: " + op);
        }
        return res;
    }

}
