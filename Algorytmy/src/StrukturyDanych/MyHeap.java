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


}



