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
        int n=Integer.parseInt(input[1]);
        System.out.println(n + "!= "+ strong(n));
    }

    private int strong (int n){
        if (n<2) return 1;
        return n*strong(n-1);
    }

}
