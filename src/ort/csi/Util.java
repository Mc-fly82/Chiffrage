package ort.csi;

import java.math.BigInteger;

public class Util {

    public static int primeGen() {
        int primeNumbers[] = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        };

        int n = (int) (Math.random() * primeNumbers.length);

        return primeNumbers[n];
    }


    public static boolean pgcd(int nb1, int nb2)
    {
        BigInteger bigE = BigInteger.valueOf(nb1);
        BigInteger bigM = BigInteger.valueOf(nb2);
        int result = bigE.gcd(bigM).intValue();
        if(result == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static int asciiConvert(char a) {

        int b = (int) a;
        return b;
    }

    public static int[] asciiConvertChaine(String message) {
        int tab[] = new int[message.length()];
        String msg = message.toUpperCase();

        for (int i = 0; i < msg.length(); i++) {
            tab[i] = asciiConvert(msg.charAt(i));
        }
        return tab;

    }

    public static void afficheTableau(int[] tableau) {

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + ",");
        }
            System.out.print("\n");

    }



}
