package demo.generics.generics;

public class TupleFactory {
    public <T, S> Tuple<T, S> createTuple(T first, S second) {
        return new Tuple<T, S>(first, second);
    }
}
