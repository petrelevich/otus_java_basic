package ru.otus.demo03.app;

import ru.otus.demo03.app.service.*;

public class Main {

    public static void main(String[] args) {
        IOService ioService = new IOStreamsService(System.out, System.in);
        FactorialCalculator factorialCalculator = new FactorialCalculatorImpl();
        FactorialApplication application = new FactorialApplication(ioService, factorialCalculator);
        application.run();
    }
}
