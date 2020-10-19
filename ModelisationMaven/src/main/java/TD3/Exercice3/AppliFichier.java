package TD3.Exercice3;

import java.io.*;
import java.util.Scanner;

public class AppliFichier {
    public static void lectureFichier() throws IOException{
        BufferedReader lectureClavierFichier = new BufferedReader(new InputStreamReader(System.in));

        boolean file = false;
        while(!file){
            try {
                System.out.println("Entrez le nom du fichier");
                String fichier = lectureClavierFichier.readLine();
                BufferedReader lectureFichier = new BufferedReader(new FileReader(fichier));
                file = true;
                String c = lectureFichier.readLine();
                while (c!=null){
                    System.out.println(c);
                    c = lectureFichier.readLine();
                }
                lectureClavierFichier.close(); // ferme le fichier associer
                System.out.println("Fin saisie");
            } catch (FileNotFoundException e) {
                System.out.println("Fichier non trouvé");
            }
        }
    }
    public static void main(String[] args) throws IOException {

        lectureFichier();
    }
}
