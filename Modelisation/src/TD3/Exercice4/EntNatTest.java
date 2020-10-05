package TD3.Exercice4;



class EntNatTest {
    public static void main(String[] args) {
        try {
            EntNat n = new EntNat(1);
            n.decremente();
            n.decremente();
            n.getN();
            n.getMessage();
        } catch (ErrModif errModif) {

            errModif.printStackTrace();
        }

    }
}