package ru.itvitality.collections;

import java.util.*;

public class ArrayListDemo {
    public static void main( String[] args ) {

        Integer[] array = new Integer[ 10 ];
        for ( int i = 0; i < 10; i++ ) {
            array[ i ] = Double.valueOf( Math.random() * 1000 ).intValue();
        }
        List<Integer> list = Arrays.asList( array );
        System.out.println( list );

        // list.add( new Integer(10)); // Ошибка


        //Как убрать дубли
        List<String> strDubl = Arrays.asList( "1", "2", "2", "4" );
        System.out.println( "srtDubl:" + strDubl );
        Set<String> strDublFiltered = new HashSet<>( strDubl );
        System.out.println( "strDublFiltered:" + strDublFiltered );

        //АвтоСортировка
        Set<Integer> sorted = new TreeSet<>();
        sorted.add( 1 );
        sorted.add( 9 );
        System.out.println( "sorted_1:" + sorted );
        sorted.add( 2 );
        sorted.add( 8 );
        System.out.println( "sorted_2:" + sorted );


    }
}
