package Alghoritms;

/**
 * Created by RENT on 2017-07-27.
 */
public class Statki extends AbstractAlgorithm {
    private String[][] tab;
    char a;
    @Override
    public String getName() {
        return "Statki";
    }

    @Override
    public void runAlgorithm(String[] input) {
        double n = Math.sqrt(Integer.parseInt(input[1]));
        if ((n)%1!=0) {
            System.out.println("Ta liczba jest niepierwiastkowalna ");
        } else {
            createTest((int)n);
            printTest();
        }
        }

    private void printTest() {
        for (String[] s1 :tab) {
            for (String s2 :s1) {
                System.out.print(s2+" ");
            }
            System.out.println();
        }
    }

    private void createTest(int n) {
        tab=new String[(int)n][];
        for (int i = 0; i <tab.length ; i++) {
            tab[i]=new String[tab.length];
            a='A';
            for (int j = 0; j <tab[i].length ; j++) {
                tab[i][j]=(a+""+(i+1));
                a++;
            }
        }
    }
}

