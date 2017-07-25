package Alghoritms;

/**
 * Created by RENT on 2017-07-24.
 */
public class TriangleHolyday extends AbstractAlgorithm {
    private double [] sum;


    @Override
    public String getName() {
        return "triangle Holiday";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int index=3;
        for (int i=0; i<Integer.parseInt(input[2]);i++) {
            int n = Integer.parseInt(input[index]);
            int k = Integer.parseInt(input[index + 1]);
            index=index+2;
            sum[i]=0;
            for (int j = 0; j <n ; j++) {
                sum[i]=sum[i]+calculateArea(Integer.parseInt(input[index]),
                                            Integer.parseInt(input[index+1]),
                                            Integer.parseInt(input[index+2]));
                index=index+3;
            }
            sum[i]=sum[i]*k;
        }

        System.out.println("wykonano "+sum.length + " testów:");
        for (int i = 0; i <sum.length; i++) {
            System.out.println("Dla testu nr"+(i+1)+" zuzyto "+sum[i]+" kredy.");
        }
    }

private double calculateArea (int a, int b, int c){
        double p=(a+b+c)/2;
        return Math.pow((p*(p-a)*(p-b)*p-c),0.5); // Heron pattern
}

}
