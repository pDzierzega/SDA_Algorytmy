package StrukturyDanych;

import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by RENT on 2017-08-01.
 */
public class My_List<T> {

    private Element<T> _head;
    private Element<T> _tail;
    private int _counter;


    public void printListForward() {
        if (_head != null) {
            Element<T> p = _head;
            while (p.getNextElement() != null) {
                System.out.println(p.getData().toString());
                p = p.getNextElement();
            }
            System.out.println(_tail.getData());

        }
    }


    public void printListBack() {
        if (_tail != null) {
            Element<T> p = _tail;
            while (p.getPrevElement() != null) {
                System.out.println(p.getData().toString());
                p = p.getPrevElement();
            }
            System.out.println(_head.getData());
        }
    }

    public <T> boolean contains(T Data) {
        Element p = _tail;
        while (p.getPrevElement() != null) {
            if (p.getData().equals(Data)) return true;
            p = p.getPrevElement();
        }
        return false;
    }

    public Element get(int index) {
        int counter = 0;
        Element temp = _head;
        while (counter != index) {
            temp = temp.getNextElement();
            counter++;
        }
        return temp;
    }


    public <T> void add(T newData) {
        if (_head == null) {
            _head = new Element(null, newData);
            _tail = _head;
        } else {
            _tail = new Element(_tail, newData);
            _tail.getPrevElement().setNextElement(_tail);
        }
        _counter++;
    }

    public <T> void add(T... data) {
        for (T singleData : data) {
            if (_head == null) {
                _head = new Element(null, singleData);
                _tail = _head;
            } else {
                _tail = new Element(_tail, singleData);
                _tail.getPrevElement().setNextElement(_tail);
            }
            _counter++;
        }
    }

    public <T> void addOnBeginning(T data) {
        _head = new Element(data, _head);
        _head.getNextElement().setPrevElement(_head);
        _counter++;
    }

    public void remove(Element p) {
        try {

            if (_head == p) {
                _head = p.getNextElement();
                _head.setPrevElement(null);
            } else {
                p.getPrevElement().setNextElement(p.getNextElement());
            }

            if (_tail == p) {
                _tail = p;
                _tail.setNextElement(null);
            } else {
                p.getNextElement().setPrevElement(p.getPrevElement());
            }
        } catch (NullPointerException ex) {
        }
        _counter--;
    }

    public int length() {
        return _counter;
    }


    public Stream stream(){
        Stream.Builder<T> b=Stream.builder();
        Element p=_head;
        while (p!=_tail){
            b.add((T) p.getData());
            p=p.getNextElement();
        }
        b.add(_tail.getData());
        Stream<T> s=b.build();
        return s;

    }

 }




