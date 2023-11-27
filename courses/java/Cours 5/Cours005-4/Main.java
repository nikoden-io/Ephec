import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        System.out.println("Veuillez entrer un nombre entier :");
        long firstNumber = s.nextLong();
        long sum = firstNumber;
        long currentNumber;

        while (true) {
            System.out.println("Veuillez entrer un autre nombre entier :");
            currentNumber = s.nextLong();
            sum += currentNumber;

            if (currentNumber >= cube(firstNumber)) {
                System.out.println("Différence entre la somme et le dernier nombre: " + (sum - currentNumber));
                break;
            }
        }
        // Votre code doit être AVANT de ce commentaire
    }
    // Vos fonctions doivent être APRES ce commentaire
    private static long cube(long number) {
        long result = 1;
        for (int i = 0; i < 3; i++) {
            result *= number;
            // Vérifier le dépassement de capacité
            if (result < 0) {
                System.out.println("Erreur: dépassement de capacité lors du calcul du cube.");
                return -1;
            }
        }
        return result;
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
