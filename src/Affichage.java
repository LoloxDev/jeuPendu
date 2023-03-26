public class Affichage {
    Joueur whoPlay;
    Joueur whoLook;
    public Affichage() {
    }

    public void afficherLettre(String lettres, String mot) {
        for (int i = 0; i < mot.length(); i++) {
            boolean trouve = false;
            for (int j = 0; j < lettres.length(); j++) {
                if (mot.substring(i, i + 1).equals(lettres.substring(j, j + 1))) {
                    System.out.print(mot.charAt(i)); // affiche la ou les lettres
                    trouve = true;
                }
            }
            if (!trouve) {
                System.out.print("_"); // affiche un _ pour cacher les lettres
            }
        }
        System.out.print("\n");
    }
    public void afficherMot(){
        System.out.println("lemot");
    }


    public void afficherProchainJoueur(){
        Joueur x = whoPlay;
        whoPlay = whoLook;
        whoLook = x;
        System.out.println("C'est au tour de " + whoLook.getNom() + " de choisir un mot et " + whoPlay.getNom() + " doit le trouver.");
    }

    public void afficherQuiCommence(Joueur joueur1, Joueur joueur2){
        //Math.random pour savoir qui joue et qui regarde

        if(Math.random() <= 0.5){
            this.whoPlay = joueur1;
            this.whoLook = joueur2;
        } else {
            this.whoPlay = joueur2;
            this.whoLook = joueur1;
        }
        System.out.println("C'est " + whoLook.getNom() + " qui donne le mot et " + whoPlay.getNom() +" qui doit le trouver.");
    }

    public void afficheResultats(){

    }
}
