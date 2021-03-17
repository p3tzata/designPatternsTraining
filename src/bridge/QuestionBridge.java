package bridge;

public class QuestionBridge {

	Question question;

	public QuestionBridge(Question question) {
	
		this.question = question;
	}
	
	
	public void nextQuestion() {
		this.question.nextQuestion();
	}
	
	public void showQuestion() {
		this.question.showQuestion();
	}
	
	
}
