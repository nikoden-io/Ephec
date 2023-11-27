public class Intro {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*
            Multi line comment
        */

        // Single line comment
        final int a;
        double b = 137.65675;
        int c = 2, d = 3, e = 4;
        short f  = 32767;
        final long g = 265555555;
        byte h = 10;
        boolean boolA = true;
        boolean boolB = false;

        /*
        byte: nombre de −128 jusqu’à 127 (1 byte)
        short: nombre de −32768 jusqu’à 32767 (2 bytes)
        int: nombre de −2 exp31 jusqu’à 2 exp31 − 1 (4 bytes)
        long: nombre de −2 exp64 jusqu’à 2 exp64 − 1 (8 bytes)
         */
        a = 180;
        // a++; => error cause declared as final and so is one-time value allocation
        System.out.println(a); // 2
        System.out.println(h);

        // IF ... ELSE
        if ((boolA && boolB) || (c > d)) {
            System.out.println("OK 1");
        } else {
            System.out.println("OK 2");
        }

        final int day = 7;
        // Switch
        switch(day) {
            case 1:
                System.out.println("Switch 1");
                break;
            case 2:
                System.out.println("Switch 2");
                break;
            case 7:
                System.out.println("Switch 7");
                break;
            default:
                break;
        }

        // For loop
        int iTest;
        System.out.println("START FOR");
        for (iTest=0; iTest <10; ++iTest) {
            System.out.println(iTest);
        }
        System.out.println("Final i value");
        System.out.println(iTest);


        // While loop
        /*
        * entier i = 0
        * tant que (i <= 20)
        *   afficher("la valeur de i : " + i)
        *   ++i
        * fin tant que
        * afficher("terminé")
        * */
        System.out.println("START WHILE");
        int w = 0;
        while (w <= 20) {
            System.out.println(w);
            w++;
        }

        /*
        * pour (i; i <= 20; i++)
        *   si (i % 2 == 1)
        *   alors
        *       afficher(i)
        *   fin si
        * fin pour
        * */
        System.out.println("START ODD VALUES");
        for(int i=0; i<20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        /*
         * entier i = 0
         * tant que (i <= 20)
         *    si (i % 2 == 1)
         *   alors
         *       afficher(i)
         *   fin si
         *   ++i
         * fin tant que
         * afficher("terminé")
         * */
        System.out.println("START WHILE ODD");
        int w2 = 0;
        while (w2 <= 20) {
            if (w2 % 2 == 1) {
                System.out.println(w2);
            }
            w2++;
        }

        /*
          flottant resistance = 1000
          flottant pas = 0.5
          pour (flottant u = 6; u <= 20; u += pas)
            flottant intensity = (u * u) / 1000
            Afficher "Resistance for : " + u + "v is : " + intensity
          fin pour
          afficher("terminé"
         */
        float resistance = 1000;
        System.out.println("START FOR OHM ");
        for (float u=6; u<=20; u += 0.5F) {
            float intensity = (u*u) / resistance; // U carré / résistance
            System.out.println("Resistance for : " + u + "v is : " + intensity);
        }
    }
}
