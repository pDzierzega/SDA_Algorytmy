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
        int a=0;
        int b;
        StringBuilder onp=new StringBuilder();

        for (int i = 1; i <input.length ; i++) {
            onp.append(input[i]);
            switch (input[i]) {
                case "A":
                    a = stack.peek();
                    stack.pop();
                    b = stack.peek();
                    stack.pop();
                    stack.push(a * b);
                    break;
                case "/":
                    a = stack.peek();
                    stack.pop();
                    b = stack.peek();
                    stack.pop();
                    stack.push(a / b);
                    break;
                case "+":
                    a = stack.peek();
                    stack.pop();
                    b = stack.peek();
                    stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    a = stack.peek();
                    stack.pop();
                    b = stack.peek();
                    stack.pop();
                    stack.push(a - b);
                    break;
                case "=":
                    if (i!=input.length-1 ) System.out.println("Podano złe dane");
                    break;
                default:
                    onp.append(" ");
                    stack.push(Integer.parseInt(input[i]));
            }
        }
        a=stack.peek();
        stack.pop();

        if (stack.empty()){
            System.out.println("Obliczenia wykonano porawnie");
            System.out.print ("Wynik działania:"+onp.toString() +a);
        } else {
            System.out.println("Wystapił bład. Podano złe dane");
        }

    }}

