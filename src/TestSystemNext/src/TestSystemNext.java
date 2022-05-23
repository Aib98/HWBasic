public class TestSystemNext {
    public static void main(String[] args) {
        int [] rightAnswerIndex = {3,3,1};
        String [] allQuestion = {"В файл с каким расширением компилируется java-файл?",
            "С помощью какой команды git можно получить полную копию удаленного репозитория?",
            "С помощью какой команды git можно получить полную копию удаленного репозитория2?"
        };
        String [] allAnswer = {"1. cs", "2. java", "3. class", "4. exe",
                "1. commit", "2. push", "3. clone", "4. copy",
                "1. While", "2. for", "3. loop"//убрать вопросы и ответы
        };

        for (int i = 0; i < 4; i++) {


            Answer answer = new Answer("1");
            Element element = new Element("3","1", rightAnswerIndex.length);
            System.out.println(element);
            Test test = new Test(new Element[]{element});
        }

    }

}
