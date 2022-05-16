public class Question {
    private String [] Answer;
    private int rightAnswerIndex;
    private boolean ask(){
        return true;
    }

    public void setRightAnswerIndex(int rightAnswerIndex) {
        this.rightAnswerIndex = rightAnswerIndex;
    }

    public int getRightAnswerIndex() {
        return rightAnswerIndex;
    }

}
