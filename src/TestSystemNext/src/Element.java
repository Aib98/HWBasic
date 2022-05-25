import java.util.Arrays;
import java.util.Scanner;

public class Element {
    private String questions;
    private String[] answers;
    private int rightAnswerIndex;

    public Element(String questions, String[] answers, int rightAnswerIndex) {
        this.questions = questions;
        this.answers = answers;
        this.rightAnswerIndex = rightAnswerIndex;
    }

    private boolean ask() {
        return true;
    }

    public void setRightAnswerIndex(int rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }

    @Override
    public String toString() {
        return  "Вопрос: " + questions + '\n' +
                "Варианты ответов:" + Arrays.toString(answers) + '\n' +
                "Введите ваш ответ: ";
    }

    public boolean ask (int rightAnswerIndex){
        Scanner scanner = new Scanner(System.in);
        if(Integer.parseInt(scanner.nextLine()) == rightAnswerIndex) {
            return true;
            }
            return false;
    }

    private Test test;
    public void setTest(Test test) {
        this.test = test;
    }

}