public class Element {//Element
//    private String answers = {"1. cs", "2. java", "3. class", "4. exe",
//            "1. commit", "2. push", "3. clone", "4. copy",
//            "1. While", "2. for", "3. loop"//убрать вопросы и ответы
//    };

//    private String Questions = {"В файл с каким расширением компилируется java-файл?",
//            "С помощью какой команды git можно получить полную копию удаленного репозитория?",
//            "С помощью какой команды git можно получить полную копию удаленного репозитория?"
//    };

    private String questions;
    private Answer[] answers;
    private int rightAnswerIndex;

    public Element(String questions, Answer[] answers, int rightAnswerIndex) {
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

//    public String[] getAnswer(int position) {
//        return new String[]{Answer[position]};
//    }

//    public String[] getQuestions(int position) {
//        return new String[]{Questions[position]};
//    }
//    protected boolean ask (String userInput){
//        if(Integer.parseInt(userInput) == rightAnswerIndex) return true;
//        return false;
//    }//раскоментировать
}