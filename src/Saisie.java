import java.util.Scanner;

public class Saisie {

    Scanner scan = new Scanner(System.in);

   public Saisie() {
   }

    public String[] saisirMot() {

        String[] motIndice = new String[2];

        while (true) {

            if (scan.hasNext()) { // Si la saisie est non vide
                motIndice[0] = scan.next();
                if (scan.hasNext()) { // Si un indice a été saisi
                    motIndice[1] = scan.next();
                    break;
                } else { // Sinon, message d'erreur
                    System.out.println("Erreur : vous devez entrer un indice après le mot.");
                    scan.next(); // On vide le scanner pour éviter une boucle infinie
                }
            } else { // Sinon, message d'erreur
                System.out.println("Erreur : vous devez entrer un mot et un indice.");
                scan.next(); // On vide le scanner pour éviter une boucle infinie
            }
        }

        return motIndice;

    }





    public String saisirLettre(){

        String lettre = "";

        while (true){
            if (scan.hasNextLine()){
                String saisie = scan.next(); // vérification de la validité de la saisie
                if (saisie.length() == 1 && Character.isLetter(saisie.charAt(0))){ // si c'est une lettre seule, alors on la stock
                    lettre = saisie;
                    break;
                } else {
                    System.out.println("Saisie invalide, veuillez entrer une lettre");
                }
            }
        }
        return lettre;
    }
}
