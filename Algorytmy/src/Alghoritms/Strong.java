package Alghoritms;

/**
 * Created by RENT on 2017-07-25.
 */
public class Strong extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Strong";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i = 1; i <input.length ; i++) {
            int n = Integer.parseInt(input[i]);
            System.out.println(n + "!= " + strong(n));
        }
    }

    private int strong (int n){
        if (n<2) return 1;
        return n*strong(n-1);
    }

}
