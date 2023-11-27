import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entre -30 et 30 (non inclus):");
        int nombre = scanner.nextInt();

        if (nombre <= -30 || nombre >= 30 || nombre == 0) {
            System.out.println("Le nombre entré n'est pas accepté.");
        } else {
            System.out.println(numberInLetters(nombre));
        }
        // Votre code doit être APRES de ce commentaire

        // Votre code doit être AVANT de ce commentaire
    }

    // Vos fonctions doivent être APRES ce commentaire
    private static String numberInLetters(int nombre) {
        String[] UNITE = {"", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf"};
        String[] DIX_A_DIX_NEUF = {"dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"};
        String[] DIZAINES = {"", "dix", "vingt", "trente"};

        if (nombre < 0) {
            return "moins " + numberInLetters(-nombre);
        } else if (nombre < 10) {
            return UNITE[nombre];
        } else if (nombre < 20) {
            return DIX_A_DIX_NEUF[nombre - 10];
        } else {
            int dizaine = nombre / 10;
            int unite = nombre % 10;
            String mot = DIZAINES[dizaine];
            if (unite == 1) {
                mot += " et un";
            } else if (unite > 0) {
                mot += "-" + UNITE[unite];
            }
            return mot;
        }
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
