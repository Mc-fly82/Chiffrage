package ort.csi;

public class Main {

    public static void main(String[] args) {

//        int p = Chiffrage.primeGen();
//        int q = Chiffrage.primeGen();


        int p = 43;
        int q = 53;

        int n = Chiffrage.commonKey(p,q);
        int m = Chiffrage.genM(p,q);
        int e = Chiffrage.publicKeyPart(m);
        int d = Chiffrage.privateKeyPart(m,e);
        String msgE = Chiffrage.encryption("message",e);


        System.out.println(p);
        System.out.println(q);
        System.out.println(n);
        System.out.println(m);
        System.out.println(e);
        System.out.println(d);
        System.out.println(msgE);

    }
    
}
