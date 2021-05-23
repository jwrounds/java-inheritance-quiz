package Main;

public class MultipleChoiceQuestion extends Question {

    private String correctAnswer;
    private String[] possibleAnswers = new String[4];

    public MultipleChoiceQuestion(String someText, String aType, String anAnswer) {
        super(someText, aType);
        correctAnswer = anAnswer;
    }

    public void buildAnswers(String answerOne, String answerTwo, String answerThree, String answerFour) {
        possibleAnswers[0] = answerOne;
        possibleAnswers[1] = answerTwo;
        possibleAnswers[2] = answerThree;
        possibleAnswers[3] = answerFour;
    }

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.length; i++) {
            System.out.println(i + " - " + possibleAnswers[i]);
        }
    }

    public String getCorrectAnswer() { return correctAnswer; }
    public void setCorrectAnswer(String answer) { correctAnswer = answer; }
}
