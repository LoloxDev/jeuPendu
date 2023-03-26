public class Affichage {
    Joueur whoPlay;
    Joueur whoLook;
    public Affichage() {
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
