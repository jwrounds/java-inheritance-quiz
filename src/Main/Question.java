package Main;

public abstract class Question {

    private String text;

    public Question(String someText) {
        text = someText;

    }

    public void askQuestion() {
        System.out.println(text);
    }

    public abstract void displayAnswers();

    public String getText() { return text; }
    public void setText(String sampleText) { text = sampleText; }
}
