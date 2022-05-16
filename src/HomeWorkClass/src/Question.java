class Question {
    private Test test;


    String[] Questions;
    String[][] Answers;


    public String readQuestions(int num){
        return Questions[num];
    }
    public String readAnswers (int rowNum, int elemPosition){
        return Answers[rowNum] [elemPosition];
    }
}