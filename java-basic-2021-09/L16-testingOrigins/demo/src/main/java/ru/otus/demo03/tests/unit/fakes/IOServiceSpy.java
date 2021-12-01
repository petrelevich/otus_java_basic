package ru.otus.demo03.tests.unit.fakes;

import ru.otus.demo03.app.service.IOService;

import java.util.List;

public class IOServiceSpy implements IOService {

    private boolean isFirstInputCall = true;
    private final List<String> actualFlow;

    public IOServiceSpy(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }


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
        actualFlow.add("inputString was called " +
                (isFirstInputCall ? "first time" : "another time"));

        if (isFirstInputCall) {
            isFirstInputCall = false;
            return "53";
        }
        return "exit";
    }
}
