package StrukturyDanych;

/**
 * Created by RENT on 2017-08-07.
 */
public class MyHeap extends MyTree <Integer> {
    private Integer[] sorted;

    public MyHeap() {
        super(Integer.class);
    }

    @Override
    public void add(Integer... data) {
        for (Integer t : data) {
            adoptFather(length, t);
            length++;
        }
        level = level();
        _root=tab[0];
    }

    private void adoptFather(int i, int t) {
        if (i > 0) {
            int parent = (i - 1) / 2;
            if (tab[parent] > t) {
                tab[i] = t;
            } else {
                tab[i] = tab[parent];
                adoptFather(parent, t);
            }
        }
    }

//    public Integer[] sort(){
//        sorted=new Integer[length];
//        sorted[length]
//        return sorted;
//    }

//    private void removeRoot() {
//        repleceWithBiggerSon(0,length-1);
//        _root=tab[0];
//        length--;
//    }

    private int indexOfBiggerSon(int i) {
        int first = 2 * i + 1;
        if (first == length - 1) return first;
        int second = first + 1;
        return tab[first] > tab[second] ? first : second;
    }

    private void repleceWithBiggerSon (int i, int t){
        if (!isLeaf(i)){
            int n=indexOfBiggerSon(i);
            if (tab[n]>t)
                tab[i]=tab[n];
                repleceWithBiggerSon(indexOfBiggerSon(i),t);
            }
        tab[i]=t;
        }
    }



