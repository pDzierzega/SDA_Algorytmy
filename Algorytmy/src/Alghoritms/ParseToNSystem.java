package Alghoritms;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-03.
 */
public class ParseToNSystem extends AbstractAlgorithm {
    private int basis;
    private char[] tab;
    private int number_10;
    private Stack<Character> stack=new Stack<>();

    @Override
    public String getName() {
        return "Parsuje liczbe z systemu dziesiętnego na podany";
    }

    @Override
    public void runAlgorithm(String[] input) {
        basis=Integer.parseInt(input[1]);
        number_10=Integer.parseInt(input[2]);

        createTab();

        while (number_10!=0){
            stack.push(tab[number_10%basis]);
            number_10=number_10/basis;
        }

        System.out.println("Liczba " + input[2] + " w systemie " + basis + " to: ");
        while (!stack.empty()){
            System.out.print(stack.peek());
            stack.pop();
        }

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
