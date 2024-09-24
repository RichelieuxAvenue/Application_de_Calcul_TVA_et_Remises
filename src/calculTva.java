import javax.swing.*;

public class calculTva {
    public static void main(String[] args) {
        boolean isOn = true;
        while (isOn) {
            boolean choix = InterractionUtilisateur.continuer();
            if (choix == false){
                isOn = false;
                continue;
            }
            int quantiteA = InterractionUtilisateur.demanderNombreEntier("Veuillez saisir la quantité de bien a");
            int quantiteB = InterractionUtilisateur.demanderNombreEntier("Veuillez saisir la quantité de bien b");
            int quantiteC = InterractionUtilisateur.demanderNombreEntier("Veuillez saisir la quantité de bien c");

            double prixTotalA = Operations.prixTTC('A', quantiteA);
            double prixTotalB = Operations.prixTTC('B', quantiteB);
            double prixTotalC = Operations.prixTTC('C', quantiteC);
            double prixTotal = prixTotalA + prixTotalB + prixTotalC;
            double prixTotalRemiseComprise = Operations.remise(prixTotal);

            String messageExplication = String.format("produit A: quantité %d prix unitaire 10€ tva 6%% pour un total de %.2f€\n" +
                    "produit B: quantité %d prix unitaire 15€ tva 6%% pour un total de %.2f€\n" +
                    "produit c: quantité %d prix unitaire 25€ tva 21%% pour un total de %.2f€\n" +
                    "Prix total: %.2f€", quantiteA, prixTotalA, quantiteB, prixTotalB, quantiteC, prixTotalC, prixTotalRemiseComprise);
            JOptionPane.showMessageDialog(null, messageExplication);

        }
    }
}
