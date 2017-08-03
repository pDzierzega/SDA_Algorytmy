package Alghoritms;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-03.
 */
public class ONP extends AbstractAlgorithm {
    private Stack<Integer> stack=new Stack<>();

    @Override
    public String getName() {
        return "Odwrotna notacja polska";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i = 1; i <input.length ; i++) {
            switch (input[i]){
                case "*":
                    break;
                case "/":
                    break;
                case "+":
                    break;
                case "-":
                    break;
                default:
                    stack.push(Integer.parseInt(input[i]));
            }

        }

    }
}
