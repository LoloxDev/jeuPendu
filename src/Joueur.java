public class Joueur {
    private String nomJoueur;
    public Joueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }


    public String getNom(){
        return nomJoueur;
    }

    public boolean estGagnant(String lettres, String mot) {
        boolean motTrouvé = true; // On suppose que toutes les lettres sont contenues dans le mot

        for (int i = 0; i < lettres.length(); i++) {
            String lettre = lettres.substring(i, i+1); // On récupère la lettre
            if (!mot.contains(lettre)) { // Si la lettre n'est pas contenue dans le mot
                motTrouvé = false; // On met la variable motTrouvé à false
                break; // On sort de la boucle for, car une lettre n'est pas contenue dans le mot
            }
        }

        if (motTrouvé) {
            System.out.println("Le joueur " + nomJoueur + " remporte la partie !");
        } else {
            System.out.println("Il manque au moins une lettre dans le mot...");
        }

        return motTrouvé;
    }

    public void estPerdant(int chances){
        if (chances <= 0){
            System.out.println("Le joueur " + nomJoueur + " est pendu et perd la partie !");
        }
    }
}
