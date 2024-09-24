public class Operations {
    public static double prixTTC(char typeProduit, int quantiteProduit) {
        double total = 0;
        int prixProduit;
        double tva;
        if (typeProduit == 'A') {
            prixProduit = 10;
            tva = 0.06;
            total = prixProduit * quantiteProduit * (1+tva);
        }
        else if (typeProduit == 'B') {
            prixProduit = 15;
            tva = 0.06;
            total = prixProduit * quantiteProduit * (1+tva);
        }
        else if (typeProduit == 'C') {
            prixProduit = 25;
            tva = 0.21;
            total = prixProduit * quantiteProduit * (1+tva);
        }
        return total;
    }
    public static double remise(double prixTotal){
        double resultat = 0;
        if(prixTotal > 25000){
            resultat = prixTotal / 1.04;
        }
        else {
            resultat = prixTotal;
        }
        return resultat;
    }
}
