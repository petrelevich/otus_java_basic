package ru.otus.assertions;

public class TestExecutor {
    public static void doTest(String testName, Runnable testAction) {
        try {
            testAction.run();
            System.out.printf("\"%s\" passed %n", testName);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", testName, e.getMessage());
        }
    }
}
