package Alghoritms;

/**
 * Created by RENT on 2017-08-03.
 */
public class ParseToNSystem extends AbstractAlgorithm {
    private int basis;
    private char[] tab;
    private int number_10;

    @Override
    public String getName() {
        return "Parsuje liczbe z systemu dziesiętnego na podany";
    }

    @Override
    public void runAlgorithm(String[] input) {
        basis=Integer.parseInt(input[1]);
        number_10=Integer.parseInt(input[2]);

        createTab();
        System.out.println(tab);
        StringBuilder builder=new StringBuilder();

        while (number_10!=0){
            builder.append(tab[number_10%basis]);
            number_10=number_10/basis;
        }

        String number_basis=builder.reverse().toString();
        System.out.println("Liczba " + input[2] + " w systemie " + basis + " to: "+number_basis);




    }

    private void createTab(){
        tab= new char[basis];

        for (int i=0 ; i<tab.length; i++){
            tab[i]=(char) ('0'+i);
        }
        char c='A';

        for (int i=10;i<tab.length;i++){
            tab[i]=c++;
        }
    }
}
