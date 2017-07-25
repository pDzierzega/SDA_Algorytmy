package Alghoritms;

/**
 * Created by RENT on 2017-07-25.
 */
public class FibonacciSequence extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "FibonacciSequence";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n =Integer.parseInt(input[1]);
        System.out.println(calcualte(n));

    }

    private long calcualte(int n) {
        if (n==1) return 1;
        if (n<1) return 0;
        return calcualte(n-1)+calcualte(n-2);
    }
}
