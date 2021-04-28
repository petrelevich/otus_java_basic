package ru.itvitality.collections;

import ru.itvitality.collections.model.Cat;

import java.util.*;

public class CollectionSample {

    public static void main( String[] args ) {
        // checkAdd();
        // catsList();
    }

    private static void checkAdd() {
        // TODO сравнить скорость
        List<Integer> list = new LinkedList<>();
        Date startTime = new Date();
        addObjects( list, 500000 );
        Date endDate = new Date();
        long delta = endDate.getTime() - startTime.getTime();
        System.out.println( "LinkedList.size = " + list.size() + ", time = " + delta );

        list = new ArrayList<>();
        startTime = new Date();
        addObjects( list, 500000 );
        endDate = new Date();
        delta = endDate.getTime() - startTime.getTime();
        System.out.println( "ArrayList.size = " + list.size() + ", time = " + delta );
    }

    private static void addObjects( Collection<Integer> collection, int count ) {
        for ( int i = 0; i < count; i++ ) {
            collection.add( Double.valueOf( Math.random() * 1000 ).intValue() );
        }
    }

    private static void catsList() {
        // Разные типы подставить (equals, hashCode (1))
        Collection<Cat> cats = new ArrayList<>();

        cats.add( new Cat( "Мурка" ) );
        cats.add( new Cat( "Васька" ) );
        cats.add( new Cat( "Пушок" ) );
        cats.add( new Cat( "Рыжик" ) );

        System.out.println( "Васька в списке :" + cats.contains( new Cat( "Васька" ) ) );

    }
}
