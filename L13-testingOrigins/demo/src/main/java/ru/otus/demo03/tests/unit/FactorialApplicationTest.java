package ru.otus.demo03.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo03.app.service.FactorialApplication;
import ru.otus.demo03.app.service.FactorialCalculator;
import ru.otus.demo03.app.service.IOService;

import java.util.ArrayList;
import java.util.List;

public class FactorialApplicationTest {

    public void testAppFlow() {
        List<String> expectedFlow = List.of("Введите n или команду \"exit\"",
                "inputString was called first time",
                "factorial calculations was called with n = 53",
                "53! = 2021",
                "Введите n или команду \"exit\"",
                "inputString was called another time");

        List<String> actualFlow = new ArrayList<>();
        IOService ioServiceSpy = new IOService() {
            private boolean isFirstInputCall = true;

            @Override
            public void outputString(String message) {
                actualFlow.add(message);
            }

            @Override
            public void outputString(String template, Object... args) {
                actualFlow.add(String.format(template, args));
            }

            @Override
            public String inputString() {
                actualFlow.add("inputString was called " + (isFirstInputCall ? "first time" : "another time"));
                if (isFirstInputCall) {
                    isFirstInputCall = false;
                    return "53";
                }
                return "exit";
            }
        };
        FactorialCalculator factorialCalculatorSpy = n -> {
            actualFlow.add(String.format("factorial calculations was called with n = %d", n));
            return 2021;
        };

        FactorialApplication application = new FactorialApplication(ioServiceSpy, factorialCalculatorSpy);
        application.run();

        Assertions.assertEquals(expectedFlow.size(), actualFlow.size());
        for (int i = 0; i < expectedFlow.size(); i++) {
            Assertions.assertEquals(expectedFlow.get(i), actualFlow.get(i));
        }
    }
}
