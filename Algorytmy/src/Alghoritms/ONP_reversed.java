package Alghoritms;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-04.
 */
public class ONP_reversed extends AbstractAlgorithm {
    private StringBuilder builder=new StringBuilder();
    private Stack<Operator> stack=new Stack<>();

    @Override
    public String getName() {
        return "Odwrotna notacja Polska";
    }

    @Override
    public void runAlgorithm(String[] input) {
        Operator o;
        for (int i = 1; i <input.length ; i++) {
            o=Operator.byChar(input[i].charAt(0));
            System.out.print(input[i]);
            switch (o){
                case BRACKET_ON:
                    stack.push(o);
                    break;

                case BRACKET_OFF:
                    while ( !stack.empty() && stack.peek().priority>0){
                        builder.append(stack.peek().symbol);
                        stack.pop();
                    }
                    stack.pop();
                    break;

                case MULTI: //GoThrought
                case PLUS: //GoThrought
                case MINUS: //GoThrought
                case DIV: //GoThrought
                case POW: //GoThrought
                    while (!stack.empty()&& stack.peek().priority > o.priority) {
                        builder.append(stack.peek().symbol);
                        stack.pop();
                    }
                    stack.push(o);
                    break;
                case EQUALS:
                    while (!stack.empty()){
                        builder.append(stack.peek().symbol);
                        stack.pop();
                    }
                    break;
                case NUMBER:
                    builder.append(input[i]);
            }

        }
        System.out.println();
        System.out.println(builder.toString());

    }

    private enum Operator{
        PLUS('+',1),
        MINUS('-',1),
        MULTI('*',2),
        DIV('/',2),
        POW('^',3),
        BRACKET_ON ('(',0),
        BRACKET_OFF(')',0),
        EQUALS ('=',-1),
        NUMBER ();

        char symbol;
        int priority;

        private Operator(char symbol, int priority){
            this.symbol=symbol;
            this.priority=priority;
        }
        private Operator(){}

        public static Operator byChar(char c){
            for (Operator o :Operator.values()) {
                if (o.symbol==c) return o;
            }
            return NUMBER;
        }
    }


}
