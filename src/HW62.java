package ru.otus.java;
import java.util.Scanner;

public class HW62 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов};
        int correctCount = 0, wrongCount = 0;

        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = {"В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?"};

        // TODO: Массив вариантов ответов
        String[] [] answerOptions = {
                {"1. cs", "2. java", "3. class", "4. exe"},
                {"1. commit", "2. push", "3. clone", "4. copy"},
                {"1. While", "2. for", "3. loop"}
        };

        // TODO: Массив правильных ответов
        int[] correctAnswers = {3,3,1};

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int k=0; k < answerOptions[i].length; k++ ){
                System.out.println(answerOptions[i][k]);
            }
            System.out.print("Ваш ответ: ");
            Scanner answer = new Scanner(System.in);
            int pushKey = answer.nextInt();
            // проверку результата
            if (pushKey == correctAnswers [i]){
                System.out.println("Вы отыетили правильно");
                correctCount = correctCount+1;
            }
            else {System.out.println("Вы ошиблись");
                wrongCount = wrongCount+1;
            }
        };

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
    }

