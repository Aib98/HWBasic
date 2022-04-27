import java.util.Scanner;

public class HW63 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[][] questions = {
                {"В файл с каким расширением компилируется java-файл?", "1. cs", "2. java", "3. class", "4. exe"},
                {"С помощью какой команды git можно получить полную копию удаленного репозитория?", "1. commit", "2. push", "3. clone", "4. copy"},
                {"С помощью какой команды git можно получить полную копию удаленного репозитория?", "1. While", "2. for", "3. loop"}
        };
        int[] correctAnswer = {3, 3, 1};

        for (int i = 0; i < questions.length; i++) {
            //for (int q = 0; q < questions[i].length; q++) {
            int q = 0;
            while (q < questions[i].length){
                System.out.println(questions [i] [q]);
                q++;
            }

            System.out.println("Ваш вариант ответа: ");

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == correctAnswer[i]) {
                System.out.println("Ваш ответ верный");
                correctCount = correctCount + 1;
            }

            else{
            System.out.println("Вы ответили не верно");
            wrongCount = wrongCount + 1;
        }
    }
            System.out.println(" Верных ответов: " + correctCount + " Некоректных ответов " + wrongCount);
    }
}









