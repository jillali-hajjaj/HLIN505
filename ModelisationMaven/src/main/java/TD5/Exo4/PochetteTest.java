package TD5.Exo4;

public class PochetteTest {

        public static void main(String[] args) throws Exception {
            Pochette<Livre> pLivre = new Pochette<>("La digue") ;

            Pochette<GuideVoyage> pGVoyage = new Pochette<>("Oui Voyage") ;

            Pochette<Document> pDoc = new Pochette<>("Document") ;

            Pochette<DocumentJeunesse> pDocJeun = new Pochette<>("La bringue") ;

            //pDoc.transferer(pGVoyage); // ne marche pas car ce n'est pas un type document
            pGVoyage.transferer(pDoc); // on transfert les document de pDOC car pdoc est du type document !
        }
    }

