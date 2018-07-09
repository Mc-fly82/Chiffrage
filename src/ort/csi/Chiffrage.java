package ort.csi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chiffrage {


    public static int commonKey(int p, int q) {

        return q * p;

    }

    public static int genM(int p, int q) {

        int m;
        m = (p - 1) * (q - 1);
        return m;

    }


    public static int publicKeyPart(int m) {
        int[] tab_prime = new int[2000];
        int index = 0;
        for (int i = 1; i <= m; i++) {
            if (Util.pgcd(i, m) == true) {
                tab_prime[index] = i;
                index++;
                System.out.print(i + " ");
            }
        }

        System.out.println("");


//        Scanner scan = new Scanner(System.in);

        int e = 97;

        boolean isInTab = false;

        while (isInTab != true) {

//            System.out.println("Taper un nombre : ");


            for (int i = 0; i <= tab_prime.length - 1; i++) {
                if ((int) e == tab_prime[i]) {
                    isInTab = true;
                }
            }


        }
        return e;
    }

    public static int privateKeyPart(int e, int m) {
        int d;

        for (d = e + 1; d < m * 10; d++) {

            if (e * d % m == 1) break;
        }
        return d;
    }


    public static int[] packetage(int[] tab, int v) {

        String c = "";

        for (int i = 0; i < tab.length; i++) {
            c = c + String.valueOf(tab[i]);
        }
        while (c.length() % v != 0) {
            c = c + "0";
        }
        int k = 0;
        int[] tabpack = new int[c.length() / v];
        for (int j = 0; j < c.length(); j = j + v) {
            String x = c.substring(j, j + v);
            tabpack[k] = Integer.valueOf(x);
            k = k + 1;

        }
        return tabpack;
    }


    /*
     * Encryption
     * */
    public static int[] encryption(String msg,int v, int e, int n) {


        int [] asciiConvertChaine =  Util.asciiConvertChaine(msg);


        int[] asciiEncryptTab = new int[2000];
        int[] asciiTab = new int[2000];
        asciiTab =  packetage(asciiConvertChaine,v);



        System.out.println("log:" + asciiTab[0]);

        for (int i = 0; i < asciiTab.length; i++) {

            BigInteger mBig = BigInteger.valueOf(asciiTab[i]);
            BigInteger nBig = BigInteger.valueOf(n);
            BigInteger eBig = BigInteger.valueOf(e);


            BigInteger mod = mBig.modPow(eBig, nBig);

            asciiEncryptTab[i] = mod.intValue();
        }


        return asciiEncryptTab;

    }

    public static int[] decrypt(int[] asciiEncryptTab, int d, int n) {

        for (int i = 0; i < asciiEncryptTab.length; i++) {

            BigInteger mBig = BigInteger.valueOf(asciiEncryptTab[i]);
            BigInteger nBig = BigInteger.valueOf(n);
            BigInteger dBig = BigInteger.valueOf(d);

            asciiEncryptTab[i] = asciiEncryptTab[i] ^ d % n;

            BigInteger mod = mBig.modPow(dBig, nBig);

            asciiEncryptTab[i] = mod.intValue();
        }


        return asciiEncryptTab;
    }

}


