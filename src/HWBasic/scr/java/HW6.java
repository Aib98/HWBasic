package HWBasic.scr.java;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;

        // Первый вопрос
        System.out.println("В файл с каким расширением компилируется java-файл?");
        System.out.println("1. cs");
        System.out.println("2. java");
        System.out.println("3. class");
        System.out.println("4. exe");

        System.out.print("Ваш ответ: ");
        Scanner answer = new Scanner(System.in);
        int ans = answer.nextInt();
        if (ans == 3){
            System.out.println("Ваш ответ верный");
            correctCount = correctCount +1;
        } else {System.out.println("Вы ошиблись");
            wrongCount = wrongCount +1;
        }

        // Второй вопрос
        System.out.println("С помощью какой команды git можно получить полную копию удаленного репозитория?");
        System.out.println("1. commit");
        System.out.println("2. push");
        System.out.println("3. clone");
        System.out.println("4. copy");

        System.out.print("Ваш ответ: ");
        Scanner answer2 = new Scanner(System.in);
        int ans2 = answer2.nextInt();
        if (ans2 == 3){
            System.out.println("Ваш ответ верный");
            correctCount = correctCount +1;
        } else {System.out.println("Вы ошиблись");
            wrongCount = wrongCount +1;
        }

        // Третий Вопрос
        System.out.println("Какой применяется цикл, когда не известно количество итераций?");
        System.out.println("1. While");
        System.out.println("2. for");
        System.out.println("3. loop");

        System.out.print("Ваш ответ: ");
        Scanner answer3 = new Scanner(System.in);
        int num3 = answer3.nextInt();
        if (num3 == 1){
           System.out.println("Ваш ответ верный");
           correctCount = correctCount + 1;
        } else {System.out.println("Вы ошиблись");
            wrongCount = wrongCount +1;
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}