package ru.otus.solution4_dip.services;

import ru.otus.solution4_dip.domain.User;
import ru.otus.solution4_dip.api.services.IOService;
import ru.otus.solution4_dip.api.services.UserService;

public class UserServiceImpl implements UserService {
    private final IOService ioService;

    public UserServiceImpl(IOService ioService) {
        this.ioService = ioService;
    }

    @Override
    public User askUserName() {
        return new User(ioService.readString("Введите имя"));
    }

}
