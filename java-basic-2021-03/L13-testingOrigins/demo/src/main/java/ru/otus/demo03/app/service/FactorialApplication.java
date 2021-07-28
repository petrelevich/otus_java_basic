package ru.otus.demo03.app.service;

public class FactorialApplication {
    private final IOService ioService;
    private final FactorialCalculator factorialCalculator;

    public FactorialApplication(IOService ioService, FactorialCalculator factorialCalculator) {
        this.ioService = ioService;
        this.factorialCalculator = factorialCalculator;
    }

    public void run(){
        while (true) {
            ioService.outputString("Введите n или команду \"exit\"");
            String command = ioService.inputString();
            if (command.equals("exit")) {
                break;
            } else {
                int n = Integer.parseInt(command);
                int factorial = factorialCalculator.factorial(n);
                ioService.outputString("%d! = %d", n, factorial);
            }
        }
    }
}
