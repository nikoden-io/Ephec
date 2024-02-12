import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    static class Joueur {
        String nom;
        int score;

        public Joueur(String nom, int scoreInitial) {
            this.nom = nom;
            this.score = scoreInitial;
        }

        void lancer(int points, int multiplicateur) {
            int scoreRetire = points * multiplicateur;
            if (score - scoreRetire >= 0) {
                score -= scoreRetire;
            }
        }

        boolean aGagne() {
            return score == 0;
        }
    }

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        System.out.println("Nombre de joueurs :");
        int nombreDeJoueurs = s.nextInt();
        System.out.println("Score initial (laisser vide pour 501) :");
        s.nextLine(); // Nettoyer le tampon
        String scoreInitialInput = s.nextLine();
        int scoreInitial = scoreInitialInput.isEmpty() ? 501 : Integer.parseInt(scoreInitialInput);

        Joueur[] joueurs = new Joueur[nombreDeJoueurs];
        for (int i = 0; i < nombreDeJoueurs; i++) {
            System.out.println("Nom du joueur " + (i + 1) + " :");
            String nom = s.nextLine();
            joueurs[i] = new Joueur(nom, scoreInitial);
        }

        boolean jeuTermine = false;
        while (!jeuTermine) {
            for (Joueur joueur : joueurs) {
                if (jeuTermine) {
                    break;
                }
                System.out.println("Tour de " + joueur.nom + " (Score actuel: " + joueur.score + ")");
                System.out.println("Entrez le nombre de points touchés (0-20) :");
                int points = s.nextInt();
                System.out.println("Entrez le multiplicateur (1-3) :");
                int multiplicateur = s.nextInt();

                joueur.lancer(points, multiplicateur);

                if (joueur.aGagne()) {
                    System.out.println(joueur.nom + " a gagné !");
                    jeuTermine = true;
                }
            }
        }
        s.close();
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
