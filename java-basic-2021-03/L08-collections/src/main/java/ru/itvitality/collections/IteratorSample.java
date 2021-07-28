package ru.itvitality.collections;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorSample {
    public static void main( String[] args ) {
        Integer[] array = new Integer[ 10 ];
        for ( int i = 0; i < 10; i++ ) {
            array[ i ] = Double.valueOf( Math.random() * 1000 ).intValue();
        }

        Iterable<Integer> iterable = createIterable( array );

        System.out.println( "----- array ------" );
        for ( int i = 0; i < array.length; i++ ) {
            System.out.println( array[ i ] );
        }

        System.out.println( "----- iterator ------" );
        Iterator<Integer> iterator = iterable.iterator();
        while ( iterator.hasNext() ) {
            System.out.println( iterator.next() );
        }

        System.out.println( "----- iterator simple way ------" );
        for ( Integer value : iterable ) {
            System.out.println( value );
        }
    }


    private static Iterable<Integer> createIterable( Integer[] array ) {
        return Arrays.asList( array );
    }
}
