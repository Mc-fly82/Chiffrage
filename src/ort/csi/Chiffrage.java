package ort.csi;

import java.math.BigInteger;

public class Chiffrage {

    public static int primeGen() {
        int primeNumbers[] = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        };

        int n = (int) (Math.random()*primeNumbers.length);

        return primeNumbers[n];
    }
    
    public static int PubteKeyPart(int p, int q) {
    
		int m;
		m=(p-1)*(q-1);
		return m;
    	
    }
}