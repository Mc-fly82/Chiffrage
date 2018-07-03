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
}
