package Alghoritms;

/**
 * Created by RENT on 2017-07-28.
 */
public class GeneratorPlanszyWarcaby extends  AbstractAlgorithm {
    private char[][]tab;
    private char[] color={'C','B'};

    @Override
    public String getName() {
        return "Generator Planczy Warcaby";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int m=Integer.parseInt(input[1]);
        int n=Integer.parseInt(input[2]);

        if (input[3].charAt(0)==color[1] ) {
            color[1]=color[0];
            color[0]=input[3].charAt(0);
        }



        tab = new char [m][n];
        for (int i = 0; i <m ; i++) {
            for (int j= 0; j <n ; j++) {
                tab[i][j]=color[(i+j)%2];
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }



    }
}
