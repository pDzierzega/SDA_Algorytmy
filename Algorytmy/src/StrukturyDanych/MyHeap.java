package StrukturyDanych;

import java.util.Arrays;

/**
 * Created by RENT on 2017-08-07.
 */
public class MyHeap extends MyTree <Integer> {

    public MyHeap() {
        super(Integer.class);
    }

    @Override
    public void add(Integer... data) {
        for (Integer t : data) {
            if (!adoptFather(length, t)) _root=tab[0];
            length++;
        }
        level = level();
    }

    private boolean adoptFather(int i, int t) {
        if (i > 0) {
            int parent = (i - 1) / 2;
            if (tab[parent] < t) {
                tab[i] = tab[parent];
                return adoptFather(parent, t);
            }
        }
        tab[i]=t;
        return i==0? true:false;
        }



    public int[] sorted (){
        int[] sorted=new int[length];
        while (length>0){
            length--;
            sorted[length]=_root;
            removeRoot();
        }
        System.out.println(sorted.length);
        return sorted;
    }

    private void removeRoot() {
        levelDown();
        repleceWithBiggerSon(0,tab[length]);
        _root=tab[0];
    }

    private boolean repleceWithBiggerSon (int i, int t){
        if (!isLeaf(i)){
            int n=indexOfBiggerSon(i);
            if (tab[n]>t){
                tab[i]=tab[n];
                return repleceWithBiggerSon(n,t);
                }
        }
        tab[i]=t;
        return true;
    }

    private int indexOfBiggerSon(int i) {
        int first = 2 * i + 1;
        if (first == length-1) return first;
        int second = first + 1;
        return tab[first] > tab[second] ? first : second;
    }

    private void levelDown() {
        int i = level;
        while ((int) Math.pow(2,i) < length) {
            i--;
        }
        this.level=i;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        String[] singleLine = new String[(int) Math.pow(2,level+1)];

        int index;
        int increment;
        int i=0;

        for (int j = 0; j <=level ; j++) {

            singleLine[0]="LVL"+j;
            for (int k = 1; k <singleLine.length ; k++) {
                singleLine[k]=" ";
            }

            index=(int) Math.pow(2,level-j);
            increment=(int) Math.pow(2,level-j-1);

            for (int k = index; k <singleLine.length ; k=k+increment) {
                singleLine[k]=tab[i].toString();
                i++;
            }

            for (String s:singleLine){
                builder.append(String.format("%5s",s));
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}



