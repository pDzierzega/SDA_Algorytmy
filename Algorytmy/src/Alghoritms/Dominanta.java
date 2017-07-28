package Alghoritms;

/**
 * Created by RENT on 2017-07-28.
 */
public class Dominanta extends AbstractAlgorithm {
    private int [] T;
    private int [] L;
    private int [] W;


    @Override
    public String getName() {
        return "dominanta";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n=input.length-1;

        T=new int[n];
        int max=0;
        int min=0; //gdyby były podane liczby ujemne
        for (int i = 0; i <n ; i++) {
            T[i]=Integer.parseInt(input[i+1]);
            if (T[i]>max) max=T[i];
            if (T[i]<min) min=T[i];
        }
        for (int i = 0; i <n ; i++){
            T[i]=T[i]-min;
        }
        max=max-min;

        L=new int[max+1];
        W=new int[max+1];

        for (int i = 0; i <max ; i++) {
            L[i]=i;
        }

        for (int i = 0; i <n ; i++) {
            W[T[i]]++;
        }

        n=0;

        for (int i = 0; i <max ; i++) {
            if (W[i]>W[n]) n=L[i];
        }
        n=n+min;
        System.out.println("dominanta dla podanego zbioru liczb to: " + n);
    }
}

