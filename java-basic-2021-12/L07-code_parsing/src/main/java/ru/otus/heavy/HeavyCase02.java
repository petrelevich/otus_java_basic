package ru.otus.heavy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("all")
public class HeavyCase02 {
    // Примерно 7 недочетов
    public static void main(String[] args) throws IOException {
        String[] Messages = new String[] {"Давайте заполним почтовое извещение", "Ваше ФИО",
                "Город проживания",  "Почтовый индекс", "Номер паспорта", "Серия паспорта", "Кем выдан",
                "Отлично! Извещение заполнено, пожалуйста проверьте введенные данные", "До свидания!"};
        String FIO = "";
        String livingInTheTown = "";
        String postIndex = "";
        String passportNum = "";
        String passportSeries = "";
        String kemVidan = "";
        for (int i = 0; i < Messages.length; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(Messages[i]);
            switch (i) {
                case 1: FIO = br.readLine(); break;
                case 2: livingInTheTown = br.readLine(); break;
                case 3: postIndex = br.readLine(); break;
                case 4: passportNum = br.readLine(); break;
                case 5: passportSeries = br.readLine(); break;
                case 6: kemVidan = br.readLine(); break;
                case 7: {
                    System.out.println(Messages[1] + ": " + FIO);
                    System.out.println(Messages[2] + ": " + livingInTheTown);
                    System.out.println(Messages[3] + ": " + postIndex);
                    System.out.println(Messages[4] + ": " + passportNum);
                    System.out.println(Messages[5] + ": " + passportSeries);
                    System.out.println(Messages[6] + ": " + kemVidan);
                    System.out.println();
                    break;
                }
            }
        }
    }
}
