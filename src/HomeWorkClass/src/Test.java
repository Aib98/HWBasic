class Test {
    int[] correctAnswer;
    int correctCount;
    int wrongCount;

    public boolean showText(int ask, int readAnswer) {
        if (ask == readAnswer) {
            System.out.println("Вы ответили правильно");
            correctCount = correctCount + 1;
            return true;

        } else {
            System.out.println("Вы ошиблись");
            wrongCount = wrongCount + 1;
            return false;
        }
    }
}
