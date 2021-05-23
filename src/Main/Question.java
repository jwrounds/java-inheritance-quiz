package Main;

public abstract class Question {

    private String text;
    private String type;

    public Question(String someText, String aType) {
        text = someText;
        type = aType;
    }

    public void askQuestion() {
        System.out.println(text);
    }

    public abstract void displayAnswers();

    public String getText() { return text; }
    public void setText(String sampleText) { text = sampleText; }
    public String getType() { return type; }
    public void setType(String newType) { type = newType; }
}
