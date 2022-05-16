import java.net.SocketOption;

public class Answer {
    private String text;

    Answer (String text) {
        this.text = text;
    }

    public void showText (boolean answer){
        if (answer) System.out.println(text + "Вы ответили правильно");
        else System.out.println(text + "Вы ошиблись");
    }
}

