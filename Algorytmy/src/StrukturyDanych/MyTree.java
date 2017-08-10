package StrukturyDanych;

import java.lang.reflect.Array;

/**
 * Created by RENT on 2017-08-02.
 */
public class  MyTree <T> {
    protected T[] tab;
    protected T _root;
    protected int length;
    protected int level;
    private final static int MAX_LENGTH=10000;

    public MyTree(Class <T> c) {
        this.tab = (T[]) Array.newInstance(c, MAX_LENGTH);
        this.level=0;
        this.length=0;
        _root=tab[0];
}

    protected int level() {
        int level = 0;
        while ((int) Math.pow(2,level) < length-1) {
            level++;
        }
        return  level;
    }

    public void add (T... data){
        for (T t :data) {
            tab[length]=t;
            length++;
        }
        level=level();
        _root=tab[0];
    }

    public boolean isLeaf (int i){
        return (2*i)>=length;
    }


    public T get (int i){
        return tab[i];
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
