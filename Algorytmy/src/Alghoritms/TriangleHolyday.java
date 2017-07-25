package Alghoritms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-24.
 */
public class TriangleHolyday extends AbstractAlgorithm {
    private int [][][] abc;
    private double [] k;
    private int[]n;


    @Override
    public String getName() {
        return "triangle Holiday";
    }

    @Override
    public void runAlgorithm(String[] input) {
        createAlgoritm(input);

       System.out.println("wykonano "+n.length+" testów:");
        for (int i = 0; i <n.length ; i++) {
            System.out.println("Dla testu nr" +(i+1) + " zuzyto "+ calculateTest(i) + "kredy");
        }

    }

    public void createAlgoritm (String[] input) {
        int numOfTest=Integer.parseInt(input[1]);

        abc=new int[numOfTest][][];
        k=new double[numOfTest];
        n=new int[numOfTest];

        int index=2;

        for (int i=0; i<numOfTest;i++) {
                index=createTest(i,index,input);
        }
        if ((index)!=(input.length)) System.out.println("Nie wcztrano wszystkich danych");
    }


private int createTest (int i, int index,String[] input) {  //i- currentNumOfTest
    n[i] = Integer.parseInt(input[index]);
    k[i] = Double.parseDouble(input[index + 1]);
    index=index+2;

    abc[i]=new int[n[i]][3];

    for (int j = 0; j <n[i] ; j++) {
        for (int l = 0; l <3 ; l++) {
            abc[i][j][l]=Integer.parseInt(input[index]);
            index++;
        }
    }
    return index;
}

private double calculateTest(int currentNumOfTest){    //i- currentNumOfTest
    double area=0;
    for (int j = 0; j < n[currentNumOfTest]; j++) {
        area=area+calculateArea(abc[currentNumOfTest][j]);
    }
    return area*k[currentNumOfTest];
}

private double calculateArea (int[] abc){
        double p=(abc[0]+abc[1]+abc[2])/2;
        return Math.pow((p*(p-abc[0])*(p-abc[1])*p-abc[2]),0.5); // Heron pattern
}

}
