package Main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    Scanner input = new Scanner(System.in);
    ArrayList<Question> quizQuestions = new ArrayList<>();
    ArrayList<Integer> userAnswers = new ArrayList<>();

    public void setQuizQuestions(Question ... someQuestions) {
        quizQuestions.addAll(Arrays.asList(someQuestions));
    }

    public void askQuestions() {
        for (Question quizQuestion : quizQuestions) {
            quizQuestion.askQuestion();
            quizQuestion.displayAnswers();
            int answerEntered = input.nextInt();

            if (quizQuestion instanceof TrueFalseQuestion) {
                while (answerEntered > 1 || answerEntered < 0) {
                    System.out.println("Invalid answer. Enter 0 or 1");
                    answerEntered = input.nextInt();
                }
                userAnswers.add(answerEntered);
            } else if (quizQuestion instanceof MultipleChoiceQuestion) {
                int maxAnswerRange = ((MultipleChoiceQuestion) quizQuestion).getAnswers().size()-1;
                while (answerEntered > maxAnswerRange || answerEntered < 0) {
                    System.out.println("Invalid answer. Enter an integer between 0 and " + maxAnswerRange);
                    answerEntered = input.nextInt();
                }
                userAnswers.add(answerEntered);
            }
        }
        input.close();
    }

    public void gradeQuiz() {
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        int index = 0;

        for (Question quizQuestion : quizQuestions) {
            if (quizQuestion instanceof TrueFalseQuestion) {
                boolean givenTrueFalseAnswer = userAnswers.get(index) == 0;
                if (givenTrueFalseAnswer == ((TrueFalseQuestion) quizQuestion).getAnswer()) {
                    correctAnswers++;
                } else {
                    incorrectAnswers++;
                }
            } else if (quizQuestion instanceof MultipleChoiceQuestion) {
                String givenAnswer = ((MultipleChoiceQuestion) quizQuestion).getAnswers().get(userAnswers.get(index));
                if (givenAnswer.equals(((MultipleChoiceQuestion) quizQuestion).getCorrectAnswer().get(0))) {
                    correctAnswers++;
                } else {
                    incorrectAnswers++;
                }
            }
            index++;
        }

        System.out.println("You got " + correctAnswers + " out of " + (correctAnswers + incorrectAnswers) + " correct!");
    }
}
