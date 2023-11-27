import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int day, month, year;
        boolean isLeapYear;

        System.out.println("Type a day :");
        day = readNextInt();
        System.out.println("Type a month :");
        month = readNextInt();
        System.out.println("Type a year :");
        year = readNextInt();

        day++;

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            day = 1;
            month++;
        } else if (month == 2) {
            isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if ((isLeapYear && day > 29) || (!isLeapYear && day > 28)) {
                day = 1;
                month++;
            }
        } else if (day > 31) {
            day = 1;
            month++;
        }

        if (month > 12) {
            month = 1;
            year++;
        }

        System.out.println("Tomorrow's date will be: " + day + " " + month + " " + year);
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
