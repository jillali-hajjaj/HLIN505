package TD2;

import java.io.IOException;

public abstract class Expression {

    public Expression() {
    }

    abstract double eval();

    public boolean equals(Object o){
        if(! (o instanceof Expression))return false;
        Expression e = (Expression) o;
        return this.eval()==e.eval();
    }
}
