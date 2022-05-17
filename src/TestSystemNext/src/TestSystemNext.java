public class TestSystemNext {
    public static void main(String[] args) {
        Answer answer = new Answer("1");
        Question question = new Question("3",new Answer[]{answer}, 0);
        Test test = new Test(new Question[]{question});

    }

}
