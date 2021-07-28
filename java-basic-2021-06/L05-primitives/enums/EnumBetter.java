package enums;

public class EnumBetter {
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    public static void main(String[] args) {
        // Уже лучше
        createReport(JANUARY);
        createReport(FEBRUARY);
        createReport(DECEMBER);
        // Но все равно можем передать неправильные числа
        createReport(13);
        createReport(-1);
    }

    static void createReport(int month) {
        System.out.println("Создан отчет для месяца № " + month);
    }
}
