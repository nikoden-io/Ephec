import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        double sum = 0;
        int articleNumber = 0;

        System.out.println("Entrer le prix de l'article N° " + (articleNumber + 1) + " : "  );
        double currentPrice = s.nextDouble();

        while (currentPrice != 0) {
            if (currentPrice < 0) {
                System.out.println("Le prix d'un article ne peut pas être négatif"  );
                continue;
            }

            articleNumber++;
            sum += currentPrice;
            System.out.println("Le total actuel est de : " + sum + " euros"  );
            System.out.println("Entrer le prix de l'article N° " + (articleNumber + 1) + " : "  );
            currentPrice = s.nextDouble();
        }

        System.out.println("Le total des achats du client est de : " + sum + "\n" );
        System.out.println("Combien d'argent le client vous a-t-il donné : "  );
        double customerMoney = s.nextDouble();

        if (customerMoney < sum) {
            System.out.println("Le client ne vous a pas donné assez d'argent pour réaliser le paiement");
            return;
        }

        System.out.println("La somme à rendre est de : \n");
        double moneyRemain =  customerMoney - sum;
        int tenNumber = (int) (moneyRemain / 10);
        int twoNumber = (int) ((moneyRemain % 10) / 2);
        int oneNumber = (int) (((moneyRemain) %10) %2);

        System.out.println("Le total à rendre est de : " + moneyRemain + "\n");
        System.out.println("Veuillez rendre au client : \n" + tenNumber + " billets de 10\n" + twoNumber + " pièces de 2\n" + oneNumber + " pièce de 1\n");
        // Votre code doit être AVANT de ce commentaire
    }
    // Vos fonctions doivent être APRES ce commentaire

    // Vos fonctions doivent être AVANT ce commentaire

    /***
     * Cette fonction lis et retourne le prochain int entré par l'utilisateur
     */
    private static int readNextInt() {
        boolean valid;
        int res = 0;

        do {
            valid = true;
            try {
                res = Integer.parseInt(s.nextLine().strip().replaceAll("\n", ""));
            } catch (NumberFormatException e) {
                System.out.println("Entrée non reconnue, essayez encore !");
                valid = false;
            }
        } while (!valid);
        return res;
    }

    /***
     * Cette fonction lis et retourne le prochain double entré par l'utilisateur
     */
    private static double readNextDouble() {
        double res = Double.NaN;

        do {
            try {
                res = Double.parseDouble(s.nextLine().strip().replaceAll("\n", ""));
            } catch (NumberFormatException e) {
                System.out.println("Entrée non reconnue, essayez encore !");
            }
        } while (Double.isNaN(res));
        return res;
    }

    /***
     * Cette fonction lis et retourne le prochain char entré par l'utilisateur
     */
    private static char readNextChar() {
        return s.nextLine().charAt(0);
    }

    /***
     * Cette fonction lis et retourne la ligne entrée par l'utilisateur
     */
    private static String readNextString() {
        return s.nextLine();
    }
}
