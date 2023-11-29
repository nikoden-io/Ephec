import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        System.out.print("Entrez la longueur du tableau : ");
        int length = s.nextInt();

        if (length <= 0) {
            System.out.println("La longueur du tableau doit être supérieure à zéro.");
        } else if (length == 1) {
            System.out.println("La suite de Fibonacci avec une seule valeur est : 0");
        } else {
            System.out.print("Entrez le premier nombre de départ : ");
            int first = s.nextInt();

            System.out.print("Entrez le deuxième nombre de départ : ");
            int second = s.nextInt();

            int[] fibonacciArray = new int[length];
            fibonacciArray[0] = first;
            fibonacciArray[1] = second;

            for (int i = 2; i < length; i++) {
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
            }

            System.out.println("La suite de Fibonacci avec les deux premiers nombres de départ est :");
            for (int i = 0; i < length; i++) {
                System.out.print(fibonacciArray[i] + " ");
            }
        }
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
