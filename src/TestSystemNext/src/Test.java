public class Test {
    private String [] Question;
    private int rightAnswerCount = 0;

    public void setRightAnswerCount(int rightAnswerCount) {
        this.rightAnswerCount = rightAnswerCount;
    }

    public int getRightAnswerCount() {
        return rightAnswerCount;
    }

    protected Question question;
    public void setQuestion(Question question) {
        this.question = question;
    }

    public String[] getQuestion() {
        return Question;
    }

    private void passTest(){
    }
}
