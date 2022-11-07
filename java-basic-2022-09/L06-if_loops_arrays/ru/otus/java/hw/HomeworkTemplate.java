package lecture6;

import java.util.Scanner;

//Написать систему тестирования.
//На экран выводится вопрос и варианты ответа, с клавиатуры вводится номер ответа.
//Вопросы и ответы должны быть зашиты в коде, внешнего хранения в файлах или базах данных не нужно.
//Должно быть три вопроса, каждый с 3-5 вариантами ответов.
//Все вопросы с одним правильным вариантом ответа.
//После прохождения теста отображается результат.
//Использовать только циклы, массивы, условия и другие структуры, которые были пройдены на данный момент в рамках курса.
//В этом задании не нужно использовать ООП (создавать классы), вопросы и варианты ответов надо хранить в массиве (массивах).
public class TestingSystem {
    static int rightAnswers = 0;
    private static int AskAQuestion() {
        Scanner scanner = new Scanner(System.in);
        String[] questions = new String[]{"Сколько глаз у Майка Вазовски?",
                "Сколько глаз у Джеймса Салливана?",
                "Сколько глаз у Мистера Генри Джей Водонога III?"};
        System.out.println("Выберите вопрос");
        for (int i = 1; i <= questions.length; i++) {
            System.out.println("Вопрос номер " + i + ": " + questions[i - 1]);
        }
        return scanner.nextInt()-1;
    }

    private static int[] displayAnswers(int question) {
        Scanner scanner = new Scanner(System.in);
        int[][] answers = new int[][]{
                {0,1,2,3,1},
                {1,1,5,2,2},
                {2,1,7,5,5}};
        int questionCorrect = answers[question][4];

        System.out.println("Выберите вариант ответа");
        for (int i = 1; i < answers[question].length - 1; i++) {
            System.out.println("Вариант ответа " + i + ": " + answers[question][i]);
        }
        int[] result = {answers[question][scanner.nextInt()], questionCorrect, question};
        return result;
    }

    private static void correctnessCheck(int[] answer) {
        if (answer[0] == answer[1]){
            rightAnswers++;
        }
        testing();
    }
    private static void testing(){
        System.out.println("Если хотите продолжить нажмите 1, иначе введите 2");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == 1){
            correctnessCheck(displayAnswers(AskAQuestion()));
        } else {
            System.out.println("Спасибо за прохождение теста, вы ответили верно на " + rightAnswers + " вопросов.");
        }
    }

    public static void main(String[] args) {
        correctnessCheck(displayAnswers(AskAQuestion()));
    }
}
