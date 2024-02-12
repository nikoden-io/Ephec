import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        int[] numbers = {1, 2, 3, 5, 7, 10};
        int target;
        boolean isSolutionExisting = false;

        System.out.println("Entrez le nombre à atteindre :");
        target = s.nextInt();

        String[] operations = {"+", "-", "*", "/", "%"};

        for (int i = 0; i < numbers.length && !isSolutionExisting; i++) {
            for (int j = 0; j < numbers.length && !isSolutionExisting; j++) {
                for (int k = 0; k < operations.length && !isSolutionExisting; k++) {
                    if (calculate(numbers[i], numbers[j], operations[k]) == target) {
                        System.out.println(numbers[i] + " " + operations[k] + " " + numbers[j] + " = " + target);
                        isSolutionExisting = true;
                    }

                    for (int l = 0; l < operations.length && !isSolutionExisting; l++) {
                        if (calculate(calculate(numbers[i], numbers[j], operations[k]), numbers[j], operations[l]) == target) {
                            System.out.println(numbers[i] + " " + operations[k] + " " + numbers[j] + " " + operations[l] + " " + numbers[j] + " = " + target);
                            isSolutionExisting = true;
                        }
                    }
                }
            }
        }


        if (!isSolutionExisting) {
            System.out.println("Aucune solution trouvée.");
        }
        // Votre code doit être AVANT de ce commentaire
    }

    // Vos fonctions doivent être APRES ce commentaire
    private static int calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return b != 0 ? a / b : 0;
            case "%":
                return b != 0 ? a % b : 0;
            default:
                return 0;
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
