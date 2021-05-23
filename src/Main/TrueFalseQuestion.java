package Main;

public class TrueFalseQuestion extends Question {

    private boolean answer;

    public TrueFalseQuestion(String questionText, String questionType, boolean anAnswer) {
        super(questionText, questionType);
        answer = anAnswer;
    }

    @Override
    public void displayAnswers() {
        System.out.println("0 - True\n1 - False");
    }

    public void setAnswer(boolean anAnswer) { answer = anAnswer; }
    public boolean getAnswer() { return answer; }
}
