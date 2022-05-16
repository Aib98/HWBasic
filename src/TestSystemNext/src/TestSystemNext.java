public class TestSystemNext {
    public static void main(String[] args) {
        Answer answer = new Answer();
        answer.setText("Andrey");
        System.out.println(answer.getText());

        Question question = new Question();
        question.setRightAnswerIndex(1);

        Test test = new Test();
        test.setQuestion(question);



    }
}
