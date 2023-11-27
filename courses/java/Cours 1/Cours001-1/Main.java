import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    /*
    * Un commençant vends trois produits dont les prix unitaire sont les
suivants avec les taux de TVA associés:
• 10 e, TVA: 6%
• 15 e, TVA: 6%
• 25 e, TVA: 21%
Écrire un programme qui demande à l’utilisateur d’introduire les
quantités achetées pour chacun des produits. Le programme calculera
ensuite le montant à payer TVA comprise.
Si le montant total TVA comprise dépasse 25000 e, le client recevra une
ristourne de 4% sur le montant total TVA comprise. Afficher ce que
devra payer le client.
    * */


    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire

        int productOnePrice = 10;
        int productTwoPrice = 15;
        int productThreePrice = 25;

        double tvaRateSix = 0.06;
        double tvaRateTwentyOne = 0.21;

        double totalTva = 0;
        double totalToPay;

        System.out.println("How much product one did you buy:");
        int numberOfProductOne = readNextInt();
        System.out.println("How much product two did you buy:");
        int numberOfProductTwo = readNextInt();
        System.out.println("How much product three did you buy:");
        int numberOfProductThree = readNextInt();

        totalTva += (numberOfProductOne * (productOnePrice * tvaRateSix));
        totalTva += (numberOfProductTwo * (productTwoPrice * tvaRateSix));
        totalTva += (numberOfProductThree * (productThreePrice * tvaRateTwentyOne));

        totalToPay = (numberOfProductOne * productOnePrice) + (numberOfProductTwo * productTwoPrice) +  (numberOfProductThree * productThreePrice);

        if (totalTva > 25000) {
            totalToPay = totalToPay * 0.96;
        }

        System.out.println("Total HTVA:");
        System.out.println(totalToPay);
        System.out.println("Total TVA:");
        System.out.println(totalTva);
        System.out.println("Total to pay:");
        System.out.println(totalToPay + totalTva);


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
