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

        // On définis qui joue et qui pose le mot grace a la méthode afficherQuiCommence
        Affichage affichage = new Affichage();
        affichage.afficherQuiCommence(joueur1, joueur2);

        Joueur whoPlay = affichage.whoPlay;
        Joueur whoLook = affichage.whoLook;


        // On instancie une nouvelle saisie pour saisir et instancier par la suite un nouveau mot et son indice.
        Saisie saisie = new Saisie();

        System.out.println(whoLook.getNom() + ", veuillez entrer un mot et son indice :");
        String[] motIndice = saisie.saisirMot();

        Mot mot = new Mot(whoLook, motIndice[0], motIndice[1]);
        String motSaisi = mot.getMot();

        System.out.println("Le mot saisi par " + whoLook.getNom() + " est : " + motSaisi + " et son indice est : " + mot.getIndice());


        // On initialise un tableau pour stocker la totalité des lettres saisies
        String lettresSaisies = "";

        //J'utilise une boucle do pour la saisie des lettres tant que whoPlay n'a pas gagné
        while(whoPlay.estGagnant(lettresSaisies, motSaisi)){
        //On utilise la méthode saisirLettre de l'instance saisie pour demander une lettre au joueur whoPlay.
        System.out.println(whoPlay.getNom() + ", veuillez entrer une lettre :");
        String lettreSaisie = saisie.saisirLettre();
        System.out.println(lettreSaisie); // a Supprimer apres les test

        lettresSaisies += lettreSaisie;

        //Et on met le mot a jour
        affichage.afficherLettre(lettresSaisies, motSaisi);
        }


        //A chaque fin de partie, on apelle la méthode afficherProchainJoueur
        affichage.afficherProchainJoueur();
        whoPlay = affichage.whoPlay;
        whoLook = affichage.whoLook;

        System.out.println("whoPlay = " + whoPlay.getNom());
        System.out.println("whoLook = " + whoLook.getNom());

    }
}
