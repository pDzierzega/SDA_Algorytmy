package Alghoritms;

public class PalindronWLiczbach_v2 extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Palindrom w liczbach";
    }

    @Override
    public void runAlgorithm(String[] input) {
        System.out.println("Wczytano "+input[1] + " liczb do sprawdzenia");
        for (int i = 2; i <input.length ; i++) {
            int numOfSums=0;
            String number=input[i];
            StringBuilder reverse=new StringBuilder(number);
            reverse.reverse();

            while (!number.equals( reverse.toString()) )
            {
                int n=Integer.parseInt(number)+Integer.parseInt(reverse.toString());
                number=Integer.toString(n);
                reverse=new StringBuilder(number);
                reverse.reverse();
                numOfSums++;
            }
            System.out.println( "Dla liczby " + input[i] +
                                " pierwszy otrzymany palindrom to "+reverse+
                                ". Wykonano  " + numOfSums + " dodawań." );
        }
    }







}
