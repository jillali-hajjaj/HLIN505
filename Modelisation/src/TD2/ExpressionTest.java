package TD2;



class ExpressionTest {
    public static void main(String[] args) {
        ExpressionComplexe e = new ExpressionComplexe('+',new Constante(2),new Constante(3));
        ExpressionComplexe e1 = new ExpressionComplexe('l',new Constante(2),new Constante(3));


        System.out.println(e1.eval());
    }
}