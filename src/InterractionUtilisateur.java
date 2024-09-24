import javax.swing.*;

public class InterractionUtilisateur {

    public static boolean continuer(){
        Boolean valeurValide = false;
        int choix=0;
        while (!valeurValide){
            try {
                choix = demanderNombreEntier("Veuillez saisir '1' pour faire les calculs et '0' pour fermer le programme.");
                if (choix==1 || choix==0){
                    valeurValide = true;
                    break;
                }
                else {
                    throw new  Exception("");
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "🛑 La valeur introduite n'est pas valide.\n" +
                        " ✅Veuillez choisir entre 1 et 0.");
            }
        }
        return choix == 1;
    }

    public static int demanderNombreEntier(String prompt){
        int nombreEntier = 0;
        boolean valeurValide = false;
        while(!valeurValide){
            try{
                nombreEntier = Integer.parseInt(JOptionPane.showInputDialog(prompt));
                valeurValide = true;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "🛑 La valeur introduite n'est pas valide.\n" +
                                                                            " Veuillez saisir un nombre entier valide.");
            }
        }
        return nombreEntier;
    }
}
