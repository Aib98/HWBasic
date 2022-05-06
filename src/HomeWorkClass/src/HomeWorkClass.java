import java.util.Scanner;

class Test {
    int[] correctAnswer;
    int correctCount;
    int wrongCount;


    public boolean showText(int ask, int raidAnswer) {
        if (ask == raidAnswer) {
            System.out.println("Вы ответили правильно");
            correctCount = correctCount + 1;
            return true;

        } else {
            System.out.println("Вы ошиблись");
            wrongCount = wrongCount + 1;
            return false;
        }

    }
}

class Question {

        String[] Questions;
        String[][] Answers;
//
//        private Test test;
//        void setTest(Test test) {
//            this.test = test;
//        }
//        public Test getTest() {
//            return test;
//        }
        public String readQuestions(int num){
            return Questions[num];
        }
        public String readAnswers (int rowNum, int elemPosition){
            return Answers[rowNum] [elemPosition];
        }
//
    }
class HomeWorkClass {
        public static void main(String [] args) {



            String [] QuestionData = {
                "В файл с каким расширением компилируется java-файл?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?",
                "С помощью какой команды git можно получить полную копию удаленного репозитория?"
            };

//            String [] HueMae = {
//                    "Кто жтвет в лес?",
//                    "Когда продадти Рапиды?"
//            };
            String [] [] AnswerData = {
                {"1. cs", "2. java", "3. class", "4. exe"},
                {"1. commit", "2. push", "3. clone", "4. copy"},
                {"1. While", "2. for", "3. loop"}
            };


//            Question question = new Question();
//            question.Questions = HueMae;
//
//            var Andrey = question.Questions[0];

            Question pit = new Question();
            pit.Questions = QuestionData;
            pit.Answers = AnswerData;
            Test test = new Test();
            test.correctAnswer = new int[]{3, 3, 1};
            test.correctCount = 0;
            test.correctCount = 0;

//            System.out.println(Andrey + pitquest);

            for (int i = 0;  i < pit.Questions.length; i++) {

                String tempQ = pit.readQuestions(i);
                System.out.println(tempQ);
                for (int j = 0; j < pit.Answers[i].length; j++) {
                    System.out.println(pit.readAnswers(i, j));
                }

                //

                Scanner scanner = new Scanner(System.in);
                int userInput = scanner.nextInt();
                int riteAnswer = test.correctAnswer[i];
                boolean checkAnswer = test.showText(userInput,riteAnswer);

                if (checkAnswer){
                    test.correctCount ++;
                }
                else {
                    test.wrongCount ++;
                }


            }
            System.out.println("Правильных ответов " + test.correctCount + "  Ошибочные ответы " + test.wrongCount);



        }

    }

