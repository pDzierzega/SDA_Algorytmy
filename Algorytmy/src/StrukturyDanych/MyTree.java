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
        _root=tab[0];
        level=level();
        _root=tab[0];
    }

    protected boolean isLeaf (int i){
        return 2*i+2>level;
    }

    public T get (int i){
        return tab[i];
    }









}
