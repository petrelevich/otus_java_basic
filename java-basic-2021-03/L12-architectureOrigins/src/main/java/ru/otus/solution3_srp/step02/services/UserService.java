package ru.otus.solution3_srp.step02.services;

import ru.otus.solution3_srp.step02.domain.User;

public class UserService {

    public User askUserName(ConsoleIOService ioService) {
        return new User(ioService.readString("Введите имя"));
    }

}
