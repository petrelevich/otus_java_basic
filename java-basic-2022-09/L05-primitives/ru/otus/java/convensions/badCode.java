package ru.otus.java.convensions;

// Что здесь можно улучшить (синтаксически)?
// Логику работы, алгоритм улучшать не надо.
// Пишите в чат номер строки и что в ней исправить.

public class badCode {

    public static void main(String[] args)
    {
        int zzzz = 0;

        for (int I = 100; I < 1000; I++){
            for (int j = 100; j < 1000; j++){
            int Result = I * j;

            String _str = String.valueOf(Result); String revers = new StringBuffer(_str).reverse().toString();
            int _newb = Integer.parseInt(revers);

                if (_newb == Result)
                {
                    int answer1 = Result;
                    //int answer1 = Result * 2;



                    if (answer1 > zzzz) zzzz = answer1;}

            }
        }
             System.out.println(zzzz);

    }
}