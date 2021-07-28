package ru.otus.heavy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("all")
public class HeavyCase01 {
    // Две ошибки (почти), примерно 4 недочета
    public static void main(String[] args) throws IOException {

        System.out.println("Введите название");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        System.out.println("Введите возраст");
        String sa = br.readLine();
        int a = Integer.parseInt(sa);
        System.out.println("Введите цену");
        String sc = br.readLine();
        int c = Integer.parseInt(sc);

        String[] name = new String[] {"Клерки", "Довод", "Джентльмены", "Конёк-Горбунок"};
        int[] age = new int[] {18, 16, 18, 6};
        int[] cost = new int[] {350, 750, 500, 300};

        boolean r = false;
        for (int I = 0; I < name.length; I++) {
            if (name[I].equals(n)) {
                if (age[I] == a) {
                    if (cost[I] <= c) {
                        r = true;
                    }
                }
            }
        }
        if (r == true) {
            System.out.println("Вам можно купить билет на выбранный сеанс");
        }
    }
}
