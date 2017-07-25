package Alghoritms;

/**
 * Created by RENT on 2017-07-25.
 */
public class SumLikeStrong extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Sum Like Strong";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(sumLikeStrong(n));

    }

    private int sumLikeStrong(int n) {
        if (n<1) return 0;
        return n+sumLikeStrong(n-1);
    }
}
