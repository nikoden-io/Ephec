import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number = scanner.nextDouble();

        double roundedUp = Math.ceil(number);
        double roundedDown = Math.floor(number);
        long roundedClosest = Math.round(number);

        System.out.println("Round up of : " + number + " is " + roundedUp);
        System.out.println("Round down of : " + number + " is " + roundedDown);
        System.out.println("Round to nearest integer of : " + number + " is " + roundedClosest);
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
