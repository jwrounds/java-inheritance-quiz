package Main;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleChoiceQuestion extends Question {

    private ArrayList<String> correctAnswer = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();

    public MultipleChoiceQuestion(String someText) {
        super(someText);
    }

    public MultipleChoiceQuestion(String someText, String aType, String anAnswer) {
        super(someText);
        correctAnswer.add(anAnswer);
    }

    @Override
    public void displayAnswers() {
        int i = 0;
        for (String answer : answers) {
            System.out.println(i + " - " + answer);
            i++;
        }
    }

    public ArrayList<String> getCorrectAnswer() { return correctAnswer; }
    public void setCorrectAnswer(String ... someCorrectAnswers) {
        correctAnswer.addAll(Arrays.asList(someCorrectAnswers));
    }

    public ArrayList<String> getAnswers() { return answers; }
    public void setAnswers(String ... someAnswers) {
        answers.addAll(Arrays.asList(someAnswers));
    }
}
