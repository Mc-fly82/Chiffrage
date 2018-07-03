package ort.csi;

public class Main {

    public static void main(String[] args) {

//        test commonKey

    	int p=Chiffrage.primeGen();
    	int q=Chiffrage.primeGen();
        System.out.println(p);
        System.out.println(q);
        System.out.println(Chiffrage.PubKeyPart(p, q));


    }
    
}
