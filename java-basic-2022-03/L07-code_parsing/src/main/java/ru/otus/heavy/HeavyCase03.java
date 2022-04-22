package ru.otus.heavy;

import java.util.Scanner;

public class HeavyCase03 {

    public static void main(String[] args) {
        String[] employees = readEmployees();
        int[] employeesSalaries = readEmployeesSalaries();

        outputSalary("Введите имя сотрудника", - 1);
        String employeeName = readEmployeeName();

        outputSalary("Введите текущий НДФЛ", - 1);
        int tax = readCurrentTaxRate();

        int employeeSalary = findEmployeesSalary(employeeName, employees, employeesSalaries);

        int realSalary = calcRealSalary(employeeSalary, tax);
        outputSalary(employeeName, realSalary);

    }

    private static void outputSalary(String employee, int salary) {
        if (salary < 0) {
            System.out.println(employee);
        } else {
            System.out.printf("%s - %d%n", employee, salary);
        }
    }


    private static int calcRealSalary(int employeeSalary, int tax) {
        return (int) (employeeSalary * (1 - tax / 100d));
    }

    private static String[] readEmployees() {
        return new String[] {"Шмель Юрий Галадриелевич", "Гудвинчиков Инокентий Юрьевич",
                "Фуфелшмерц Алина Павловна", "Родригес Ифигения Геннадьевна"};
    }

    private static int[] readEmployeesSalaries() {
        return new int[] {38_000, 17_500, 19_300, 53_450};
    }

    private static int readCurrentTaxRate() {
        return new Scanner(System.in).nextInt();
    }

    private static String readEmployeeName() {
        return new Scanner(System.in).nextLine();
    }

    private static int findEmployeesSalary(String employeeName, String[] employees, int[] employeesSalaries) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(employeeName)) {
                return employeesSalaries[i];
            }
        }
        return 0;
    }
}
