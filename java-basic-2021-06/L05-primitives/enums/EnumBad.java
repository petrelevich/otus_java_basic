package enums;

public class EnumBad {
    // Приложение создает какой-то отчет за указанный месяц
    public static void main(String[] args) {
        // Не понятно, что за числа
        createReport(1);
        createReport(2);
        createReport(12);
        // Можем передать неправильные значения
        createReport(13);
        createReport(-1);
    }

    static void createReport(int month) {
        // if ...
        System.out.println("Создан отчет для месяца № " + month);
    }
}
