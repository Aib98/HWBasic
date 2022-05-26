import java.util.Scanner;
import java.util.SortedMap;

public class TestSystemNext {
    public static void main(String[] args) {
        int[] rightAnswerIndex = {3, 3, 1};
        String[] allQuestion = {"В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "Какой применяется цикл, когда не известно количество итераций?"
        };
        String[] [] allAnswer = {{'\n'+"1. cs"+'\n'+ "2. java"+'\n'+ "3. class"+'\n'+ "4. exe"},
                {'\n'+ "1. commit"+'\n'+  "2. push"+'\n'+  "3. clone"+'\n'+  "4. copy"},
                {'\n'+ "1. While"+'\n'+  "2. for"+'\n'+  "3. loop"}  //убрать вопросы и ответы
        };

        Test test = new Test();

        for (int i = 0; i < allQuestion.length; i++) {
            // Доработать! - в методе main логика наполнение и создания объектов Element и Answer работает неправильно:
            //Answer answer = new Answer("Результат - ");
            //Element element = new Element(allQuestion[i], allAnswer [i], rightAnswerIndex [i]);

            Element element = new Element(allQuestion[i], allAnswer [i], rightAnswerIndex [i]);
            System.out.println(element);

            Answer answer = new Answer("Результат - ");
            boolean checkedAnswer = element.ask(element.getRightAnswerIndex());
            if (checkedAnswer) test.rightCount();
                answer.showText(checkedAnswer);
            }

        System.out.println('\n'+ "Итого:" + '\n'+ "Правильных ответов: " + test.getRightAnswerCount());
        int count = rightAnswerIndex.length;
        int right = test.getRightAnswerCount();
        int wrong = count-right;
        System.out.println("Ошибочных ответов: " + wrong);
        }
}


