import java.util.Scanner;

class HomeWorkClass {
        public static void main(String [] args) {
            String [] QuestionData = {
                "В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?"
            };

            String [] [] AnswerData = {
                {"1. cs", "2. java", "3. class", "4. exe"},
                {"1. commit", "2. push", "3. clone", "4. copy"},
                {"1. While", "2. for", "3. loop"}
            };

            Question element = new Question();
            element.Questions = QuestionData;
            element.Answers = AnswerData;
            Test test = new Test();
            test.correctAnswer = new int[]{3, 3, 1};
            test.correctCount = 0;
            test.wrongCount = 0;


            for (int i = 0;  i < element.Questions[i].length; i++) {
                System.out.println(element.setQuestions(i));
                for (int j = 0; j < AnswerData[i].length; j++) {
                    System.out.println(element.setAnswers(i, j));
                }
                System.out.println("Введите ваш ответ:  ");


                Scanner scanner = new Scanner(System.in);
                int userInput = scanner.nextInt();
                int riteAnswer = test.correctAnswer[i];
                boolean checkAnswer = test.showText(userInput,riteAnswer);
                System.out.println(" ");
            }
            System.out.println("Правильных ответов " + test.correctCount + "  Ошибочных ответов " + test.wrongCount);

        }

    }

