package bridge;

import java.util.ArrayList;
import java.util.List;

public class QuestionImpl implements Question {

	List<String> questions;
	int currentQuestion;
	
	public QuestionImpl() {
		questions = new ArrayList<>();
		currentQuestion=0;
		questions.add("First question");
		questions.add("Second question");
	}

	@Override
	public void nextQuestion() {
		if (currentQuestion<questions.size()-1) {
			currentQuestion++;
		}
		
	}

	@Override
	public void newQuestion(String question) {
		questions.add(question);
		
	}

	@Override
	public void showQuestion() {
		System.out.println(questions.get(currentQuestion));
	}

	
	
}
