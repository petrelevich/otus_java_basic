package ru.otus.java.example03;

// Добавлять/удалять поля, расширять модель не надо.
// Считаем, что все нужные методы в классе уже есть
// Смотрим на этот класс как он есть.

// Для чего может использоваться этот класс?
public class Account {
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
}
