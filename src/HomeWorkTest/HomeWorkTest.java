import java.util.Scaner;

class Question {
    String[] quest;
    public int count = 0;

    String next() {
        return quest(count++);
    }
}
public class HomeWorkTest {
    public static void main(String[] args) {
        Question answer = new Question();

        answer.quest = new String[][]{
                {"В файл с каким расширением компилируется java-файл?", "1. cs", "2. java", "3. class", "4. exe"},
                {"С помощью какой команды git можно получить полную копию удаленного репозитория?", "1. commit", "2. push", "3. clone", "4. copy"},
                {"С помощью какой команды git можно получить полную копию удаленного репозитория?", "1. While", "2. for", "3. loop"}
        };


    }
}
    //
    //
        //String [] question = {
        //        "В файл с каким расширением компилируется java-файл?",
        //        "С помощью какой команды git можно получить полную копию удаленного репозитория?",
        //        "С помощью какой команды git можно получить полную копию удаленного репозитория?"
      //  }
    //}

//class HomeWorkTestAnswer {
   // String [] answer = {
     //       {"1. cs", "2. java", "3. class", "4. exe"},
     //       {"1. commit", "2. push", "3. clone", "4. copy"}?,
      //     {"1. While", "2. for", "3. loop"}
   // };
//}







