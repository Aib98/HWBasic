import java.security.PublicKey;

class Question {
    private Test test;


    String[] Questions;
    String[][] Answers;

    public String[] getQuestions() {
        return Questions;
    }

    public void setQuestions(String[] questions) {
        Questions = questions;
    }

    public String[][] getAnswers() {
        return Answers;
    }

    public void setAnswers(String[][] answers) {
        Answers = answers;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

//    public String readQuestions(int num){
//        return Questions[num];
//    }
//    public String readAnswers (int rowNum, int elemPosition){
//        return Answers[rowNum] [elemPosition];
//    }

}