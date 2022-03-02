package ru.otus.java.example03;

public class Example03 {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account);
    }
}

// Добавлять/удалять поля, расширять модель не надо.
// Считаем, что все нужные методы в классе уже есть.
// Все нужные геттеры, сеттеры есть.
// Рефакторить в ООП не нужно.
// Смотрим на этот класс как он есть.

// Для чего может использоваться этот класс?
// Что улучшить? Какие есть неудобства использования класса?
class Account {
    private int id;
    private long balance;
    private Currency currency;
    private String comment;

    public Account() {
        // С внутренностями класса RandomHelper считаем, что все в порядке
        this.id = RandomHelper.generateAccountId();
        this.balance = RandomHelper.generateBalance();
        this.currency = Currency.RUBLES;
    }

    public int getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", currency=" + currency +
                ", comment='" + comment + '\'' +
                '}';
    }
}
