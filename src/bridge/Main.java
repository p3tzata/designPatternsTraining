package bridge;

public class Main {

	public static void main(String[] args) {
		
		QuestionImpl questionImpl = new QuestionImpl();
		new QuestionFormater(questionImpl);
		questionImpl.showQuestion();
		questionImpl.nextQuestion();
		questionImpl.showQuestion();

	}

}
