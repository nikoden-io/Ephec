import java.math.BigInteger;
import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier positif: ");

        try {
            int nombre = scanner.nextInt();

            if (nombre < 0) {
                System.out.println("Le nombre doit être positif.");
            } else if (nombre > 20) {
                System.out.println("Veuillez entrer un nombre inférieur à 20.");
            } else {
                long resultat = calculerFactorielle(nombre);
                System.out.println("La factorielle de " + nombre + " est " + resultat);
            }
        } catch (Exception e) {
            System.out.println("Veuillez entrer un nombre entier valide.");
        }

        scanner.close();

        // Votre code doit être AVANT de ce commentaire
    }

    // Vos fonctions doivent être APRES ce commentaire
    public static long calculerFactorielle(int n) {
        long resultat = 1;

        for (int i = 2; i <= n; i++) {
            resultat = resultat * i;
        }

        return resultat;
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
