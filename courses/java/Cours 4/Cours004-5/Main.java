import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        * Ecrire un programme qui prend un entier en entr´ee et affiche en retour si ´
le nombre est sublime.
Pour rappel: un nombre est sublime si la somme de ses diviseurs et le
nombre de ses diviseurs sont tous les deux des nombres parfaits.
Pour rappel bis: un nombre est parfait si la somme de ses diviseurs
propres est ´egal `a celui-ci.to
        * */

        // Votre code doit être APRES de ce commentaire
        System.out.println("Entrer un nombre entier :");
        long numberToTest = s.nextLong();

        int sumDivisors = 0;
        int countDivisors = 0;

        for (int i = 1; i <= numberToTest; i++) {
            if (numberToTest % i == 0) {
                sumDivisors += i;
                countDivisors++;
            }
        }

        boolean isSumDivisorsPerfect = isPerfectNumber(sumDivisors);
        boolean isCountDivisorsPerfect = isPerfectNumber(countDivisors);

        if (isSumDivisorsPerfect && isCountDivisorsPerfect) {
            System.out.println("Le nombre est sublime");
        } else {
            System.out.println("Le nombre n'est pas sublime");
        }


        // Votre code doit être AVANT de ce commentaire
    }

    // Vos fonctions doivent être APRES ce commentaire
    private static boolean isPerfectNumber(int n) {
        int sumDivisors = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumDivisors += i;
            }
        }

        return sumDivisors == n;
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
