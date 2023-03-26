import java.util.ArrayList;
import java.util.Scanner;

public class Pendu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //On instancie deux joueurs avec leurs noms
        System.out.println("Bienvenue sur le pendu, joueur 1 saissez votre nom");
        Joueur joueur1 = new Joueur(scan.nextLine());
        System.out.println("Bienvenue sur le pendu, joueur 2 saissez votre nom");
        Joueur joueur2 = new Joueur(scan.nextLine());

        //Math.random pour savoir qui joue et qui regarde
        Joueur whoPlay, whoLook;

        if(Math.random() <= 0.5){
            whoPlay = joueur1;
            whoLook = joueur2;
        } else {
            whoPlay = joueur2;
            whoLook = joueur1;
        }
        System.out.println("C'est " + whoLook.getNom() + " qui donne le mot et " + whoPlay.getNom() +" qui doit le trouver.");


        // On instancie une nouvelle saisie pour saisir et instancier par la suite un nouveau mot et son indice.
        Saisie saisie = new Saisie();

        System.out.println(whoLook.getNom() + ", veuillez entrer un mot et son indice :");
        String[] motIndice = saisie.saisirMot();

        Mot mot = new Mot(whoLook, motIndice[0], motIndice[1]);

        System.out.println("Le mot saisi par " + whoLook.getNom() + " est : " + mot.getMot() + " et son indice est : " + mot.getIndice());

        //On utilise la méthode saisirLettre de l'instance saisie pour demander une lettre au joueur whoPlay.
        System.out.println(whoPlay.getNom() + ", veuillez entrer une lettre :");
        String lettreSaisie = saisie.saisirLettre();
        System.out.println(lettreSaisie);

    }
}
