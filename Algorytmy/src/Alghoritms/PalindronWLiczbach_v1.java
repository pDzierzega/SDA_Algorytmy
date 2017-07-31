package Alghoritms;

public class PalindronWLiczbach_v1 extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Palindrom w liczbach";
    }

    @Override
    public void runAlgorithm(String[] input) {
        System.out.println("Wczytano "+input[1] + " liczb do sprawdzenia");
        for (int i = 2; i <input.length ; i++) {
            int number=Integer.parseInt(input[i]);
            int reverse=reverseInt(number);

            int numOfSums=0;

            while (number-reverse!=0){
                number=number+reverse;
                reverse=reverseInt(number);
                numOfSums++;
            }
            System.out.println( "Dla liczby " + input[i] +
                                " pierwszy otrzymany palindrom to "+reverse+
                                ". Wykonano  " + numOfSums + " dodawań." );
        }
    }

    private int reverseInt (int number){
//        return Integer.reverse(number);
        int reverse=0;
        while (number!=0){
            reverse=reverse*10+number%10;
            number=number/10;
        }
        return reverse;
    }





}
