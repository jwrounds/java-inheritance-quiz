package Main;

import java.util.ArrayList;


public class CheckboxQuestion extends Question {

    private ArrayList<String> correctAnswers;
    private ArrayList<String> answers;

    public CheckboxQuestion(String someText, String aType) {
        super(someText, aType);
    }

    public void buildAnswers(String answerOne, String answerTwo, String answerThree, String answerFour) {
        answers.add(answerOne);
        answers.add(answerTwo);
        answers.add(answerThree);
        answers.add(answerFour);
    }

    @Override
    public void displayAnswers() {

    }
}
