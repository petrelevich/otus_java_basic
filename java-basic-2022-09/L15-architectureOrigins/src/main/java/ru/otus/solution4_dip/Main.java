package ru.otus.solution4_dip;

import ru.otus.solution4_dip.services.*;
import ru.otus.solution4_dip.api.services.*;

// Перенос сборки (не логики) приложения на верхний уровень, в главный класс
// EquationParser + EquationEvaluator теперь создаются снаружи, вместе с остальными классами
// Для всех компонентов приложения сделаны интерфейсы
// Одни компоненты используются внутри других только по интерфейсу
// Зависимости больше не передаются в методы, только в конструкторы
public class Main {
    public static void main(String[] args) {
        IOService ioService = new ConsoleIOService();

        UserService userService = new UserServiceImpl(ioService);

        EquationEvaluationResultHistoryHolder historyHolder = new EquationEvaluationResultHistoryHolderImpl();

        EquationParser equationParser = new EquationParserImpl();
        EquationEvaluator equationEvaluator = new EquationEvaluatorImpl();

        CommandHandler commandHandler = new CommandHandlerImpl(ioService, historyHolder, equationParser, equationEvaluator);

        ApplicationRunner applicationRunner = new ApplicationRunner(ioService, userService, commandHandler);
        applicationRunner.run();
    }
}
