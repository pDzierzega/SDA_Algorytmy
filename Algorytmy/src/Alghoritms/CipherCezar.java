package Alghoritms;

import sun.font.FontRunIterator;

/**
 * Created by RENT on 2017-07-25.
 */
public class CipherCezar extends AbstractAlgorithm{
    private char[] _letters= {  'A','B','C','D','E','F','G',
                                'H','I','J','K','L','M','N',
                                'O','P','Q','R','S','T','U',
                                'W','V','X','Y','Z'};

    @Override
    public String getName() {
        return "Szyfr Cezara";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int i = 1; i <input.length ; i++) {
            char [] word= input[i].toUpperCase().toCharArray();
            for (int j = 0; j <word.length ; j++) {
                System.out.print(encript(word[j]));
            }
            System.out.println();
        }
    }

    private char encript (char a) {
        int n= (getLetterPosition(a)+3)%_letters.length;
        return _letters[n];
    }

    private int getLetterPosition (char letter){
        for (int i = 0; i <_letters.length ; i++) {
            if (letter==_letters[i]) return i;
        }
        return -1;
    }

    }

