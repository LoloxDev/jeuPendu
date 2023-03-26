public class Mot {

    private Joueur joueur;
    private String mot;
    private String indice;

    public Mot(Joueur joueur, String mot, String indice) {
        this.joueur = joueur;
        this.mot = mot;
        this.indice = indice;
    }

    public String getMot(){
        return mot;
    }

    public String getIndice(){
        return indice;
    }


    public void reveler(){

    }


}
