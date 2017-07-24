package Alghoritms;

/**
 * Created by RENT on 2017-07-24.
 */
public class Bankomat extends AbstractAlgorithm {
    private int [] zlNominals={200,100,50,20,10,10,5,2,1};
    private int [] grNominals={50,20,10,5,2,1};

    @Override
    public String getName() {
        return "Bankomat";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i=1; i<Integer.parseInt(input[1])*2; i+=2){
            getMoney(Integer.parseInt(input[i+1]),Integer.parseInt(input[i+2]));
        }
    }

    private void getMoney(int zlToPayOut, int grToPayOut){
        int n;
        System.out.println("Wypłata kwoty "+zlToPayOut+"zł "+grToPayOut+ "gr");
        for (int i :zlNominals) {
            n=zlToPayOut/i;
            zlToPayOut=zlToPayOut-i*n; // bezpieczniej niz modulo?
            System.out.println(n+" x "+i+" zl ");
        }
        System.out.println();
        for (int i :grNominals) {
            n=grToPayOut/i;
            grToPayOut=grToPayOut%i;
            System.out.println(n+" x "+i+" gr ");
        }
        System.out.println();
        //System.out.println(grToPayOut +" " +zlToPayOut);// kontrola
    }
}
