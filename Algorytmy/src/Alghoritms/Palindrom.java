package Alghoritms;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by RENT on 2017-08-04.
 */
public class Palindrom extends AbstractAlgorithm {
    ArrayList <Integer> lista=new ArrayList<>();
    Stack<Integer> stack=new Stack<>();


    @Override
    public String getName() {
        return "Palindrom z wykorzystaniem stosu";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i = 1; i <input.length ; i++) {
            lista.add(Integer.parseInt(input[i]));
            stack.push(lista.get(i-1));
        }
    boolean a=true;

        for (Integer i :lista) {
            if (i!=stack.peek()) a=false;
            stack.pop();
        }

        if (a) System.out.println("Podany ciąg znaków jest palindromem");
        else System.out.println("Te liczby nie tworzą palindormu");


    }
}
