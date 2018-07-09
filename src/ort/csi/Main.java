package ort.csi;

public class Main {

    public static void main(String[] args) {




//        int p = Util.primeGen();
//        int q = Util.primeGen();
        System.out.println(Chiffrage.privateKeyPart(97, 2184));
        int p = 43;
        int q = 53;

        int n = Chiffrage.commonKey(p, q);
        int m = Chiffrage.genM(p, q);
        int e = Chiffrage.publicKeyPart(m);

        int d = Chiffrage.privateKeyPart(e, m);


        System.out.println("p " + p);
        System.out.println("q " + q);
        System.out.println("n " + n);
        System.out.println("m " + m);
        System.out.println("e " + e);
        System.out.println("d " + d);

        String msg = "message";

        int[] msgE = Chiffrage.encryption(msg, e);

        Util.afficheTableau(msgE);

    }

}
