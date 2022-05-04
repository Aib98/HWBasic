class Question {
    String[] quest;
    public int count = 0;

    String next() {
        return quest[count++];
    }
}
