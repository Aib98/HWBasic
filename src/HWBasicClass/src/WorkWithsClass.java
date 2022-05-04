import java.util.Scanner;

public class WorkWithsClass {
    public static void  main (String[] args) {
        int [] correctAnswer = {3,3,1};
        int correctCount = 0, wrongCount = 0;

        Elements questions = new Elements();
        questions.elements = new String[] {"В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?"};

        Variant answerVariants = new Variant();
        answerVariants.variant = new String[] [] {
                {"1. cs", "2. java", "3. c1lass", "4. exe"},
                {"1. commit", "2. push", "3. clone", "4. copy"},
                {"1. While", "2. for", "3. loop"}
        };



        for (int i = 0; i < questions.lengthMassive(); i++) {
            System.out.println(questions.row(i));
            for (int j = 0; j< answerVariants.variant[i].length; j++) {
                System.out.println(answerVariants.variant[i][j]);
            }

            System.out.println("Ваш ответ: ");
            Scanner answer = new Scanner(System.in);
            int pushKey = answer.nextInt();
            if (pushKey == correctAnswer [i]) {
                System.out.println("Вы ответили правильно");
                correctCount = correctCount +1;
            }
            else {System.out.println("Вы ошиблись");
            wrongCount = wrongCount +1;
            }

        }
        System.out.println("");
        System.out.println("Ваш итоговый результат: Вы ответили правильно:" + correctCount + "  Вы ответили неверно:" + wrongCount );



    }


}
