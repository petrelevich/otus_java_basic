package demo.generics.generics;

// Без дженериков
public class TupleStringInteger {
    private String first;
    private Integer second;

    public TupleStringInteger(String first, Integer second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

}
