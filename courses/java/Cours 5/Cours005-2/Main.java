import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        // Version WHILE
        whileVersion();
        // Version FOR
        forVersion();
        // Votre code doit être AVANT de ce commentaire
    }
    // Vos fonctions doivent être APRES ce commentaire
    private static void whileVersion() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        double average;

        while (count < 5) {
            System.out.println("While Version - Veuillez entrer un entier positif (" + (count + 1) + "/5) :");
            int number = scanner.nextInt();

            if (number > 0) {
                sum += number;
                count++;
            } else {
                System.out.println("Nombre invalide. Veuillez entrer un entier positif.");
            }
        }

        average = (double) sum / count;
        System.out.println("La somme est: " + sum + ", et la moyenne est: " + average);
    }

    private static void forVersion() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        for (int i = 0; i < 5; i++) {
            System.out.println("For version - Veuillez entrer un entier positif (" + (i + 1) + "/5) :");
            int number = scanner.nextInt();

            while (number <= 0) {
                System.out.println("Nombre invalide. Veuillez entrer un entier positif.");
                number = scanner.nextInt();
            }

            sum += number;
        }

        average = (double) sum / 5;
        System.out.println("La somme est: " + sum + ", et la moyenne est: " + average);
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
