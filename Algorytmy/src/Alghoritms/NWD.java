package Alghoritms;

/**
 * Created by RENT on 2017-07-28.
 */
public class NWD extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Zad1 - Rekurencja";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n=Integer.parseInt(input[1]);
        int k=Integer.parseInt(input[2]);

        System.out.println("Najwiekszy wspolny dzielnik dla liczb: "+n+" "+ k + " to ->" + NWD(k,n));

    }

    private int NWD(int k, int n) {
        if (k==0)   return n;
        return NWD(n%k,k);
    }
}
