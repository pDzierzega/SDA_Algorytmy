package StrukturyDanych;

/**
 * Created by RENT on 2017-08-01.
 */
public class Element <T>{

    private Element nextElement;
    private Element prevElement;
    private T  data;

    public Element(Element prevElement, T data) {
        this.nextElement = null;
        this.prevElement = prevElement;
        this.data = data;
    }

    public Element(T data , Element nextElement) {
        this.nextElement = nextElement;
        this.prevElement = null;
        this.data = data;
    }


    public Element getNextElement() {
        return nextElement;
    }

    public Element getPrevElement() {
        return prevElement;
    }

    public T getData() {
        return data;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }

    public void setPrevElement(Element prevElement) {
        this.prevElement = prevElement;
    }

    @Override
    public String toString() {
        return data.toString() ;
    }
}


