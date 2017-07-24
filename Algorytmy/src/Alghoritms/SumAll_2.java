package Alghoritms;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumAll_2 extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Sum All 2";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int sum=0;
        for (int i=1; i<input.length;i++){
            sum+=Integer.parseInt(input[i]);
            System.out.println(sum);
        }

    }
}
