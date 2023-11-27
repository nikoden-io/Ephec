import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        System.out.println("Enter price in cents:");
        int amountInCents = readNextInt();

        int euros = roundToNearestEuro(amountInCents);
        System.out.println("Amount round : " + euros + " euros");
        // Votre code doit être AVANT de ce commentaire
    }

    // Vos fonctions doivent être APRES ce commentaire
    private static int roundToNearestEuro(int cents) {
        boolean isPositive = cents > 0;

        if (!isPositive) {
            cents *= -1;
        }

        int euros = cents / 100;
        int remainingCents = cents % 100;

        if (remainingCents >= 50) {
            euros += 1;
        }

        if (!isPositive) {
            euros *= -1;
        }

        return euros;
    }
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
