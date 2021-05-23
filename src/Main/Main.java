package Main;

public class Main {

    public static void main(String[] args) {
	    Quiz quiz = new Quiz();
	    TrueFalseQuestion questionOne = new TrueFalseQuestion("1 is greater than 2", false);

	    MultipleChoiceQuestion questionTwo = new MultipleChoiceQuestion("What is the greatest number?");
	    questionTwo.setAnswers("5", "42", "12", "20");
	    questionTwo.setCorrectAnswer("42");

	    MultipleChoiceQuestion questionThree = new MultipleChoiceQuestion("What do I have in my pocket?");
	    questionThree.setAnswers("lint", "wallet", "keys", "phone", "the one ring");
	    questionThree.setCorrectAnswer("the one ring");

	    quiz.setQuizQuestions(questionOne, questionTwo, questionThree);
	    quiz.askQuestions();
	    quiz.gradeQuiz();
    }
}
