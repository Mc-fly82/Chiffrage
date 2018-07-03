package ort.csi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chiffrage {



    public static int primeGen() {
        int primeNumbers[] = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        };

        int n = (int) (Math.random() * primeNumbers.length);

        return primeNumbers[n];
    }

    

    public static int commonKey(int p, int q) {

        return q * p;

    }

    public static int genM(int p, int q) {

        int m;
        m = (p - 1) * (q - 1);
        return m;

    }

    public static int privateKeyPart(int e, int m) {
        int d;

        for ( d = e ; d < 10000000; d++) {

            if (((e * d) % m) == 1) {
                break;
            }
        }
        return d;
    }
    


    public static int publicKeyPart(int m)
    {
        int[] tab_prime = new int[2000];
        int index = 0;
        for(int i=1;i<=m;i++)
        {
            if(pgcd(i,m) == true)
            {
                tab_prime[index] = i;
                index++;
                System.out.print(i + " ");
            }
        }

        System.out.println("");


        Scanner scan = new Scanner(System.in);

        int e = 0;

        boolean isInTab=false;

        while(isInTab != true)
        {

            System.out.println("Taper un nombre : ");

            e = scan.nextInt();
            for(int i=0;i<=tab_prime.length-1;i++)
            {
                if ((int)e == tab_prime[i])
                {
                    isInTab = true;
                }
            }


        }
        return e;
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
    

    /*
    * Encryption
    * */
    public static String encryption(String msg, int e) {

     

        List<String> myList = new ArrayList<String>(Arrays.asList(msg.split("")));

        char character = 'a';
        int ascii = (int) character;


        
       return myList.get(1);
       

    }



    
}