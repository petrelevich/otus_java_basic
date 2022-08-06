package demo.generics.generics;

// Без дженериков
public class TupleNoGenerics {
    private Object first;
    private Object second;

    public TupleNoGenerics(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

}
