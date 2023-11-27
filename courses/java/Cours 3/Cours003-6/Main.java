import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 255 : ");
        int number = scanner.nextInt();

        if (number < 0 || number > 256) {
            System.out.println("Number is not in range 0 and 255");
        } else {
            int division = number;
            String result = "";
            result = bitValue(division) + result;
            division = division / 2;
            result = bitValue(division) + result;
            division = division / 2;
            result = bitValue(division) + result;
            division = division / 2;
            result = bitValue(division) + result;
            division = division / 2;
            result = bitValue(division) + result;
            division = division / 2;
            result = bitValue(division) + result;
            division = division / 2;
            result = bitValue(division) + result;
            division = division / 2;
            result = bitValue(division) + result;

            System.out.println("Number in binary is : " + result);

//            String binaryString = Integer.toBinaryString(number);
//            String formattedBinaryString = String.format("%07d", Integer.parseInt(binaryString));
//            System.out.println("Representation in 7 bits: " + formattedBinaryString);
        }
        // Votre code doit être AVANT de ce commentaire
    }
    // Vos fonctions doivent être APRES ce commentaire
    private static char bitValue(int number) {
        return number % 2 == 1 ? '1' : '0';
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
