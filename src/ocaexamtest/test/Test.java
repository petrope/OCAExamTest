package ocaexamtest.test;

import ocaexamtest.questions.Question;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private TestType testType;
    private List<Question> questions;

    public Test(TestType testType) {
        this.testType = testType;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void deleteQuestion(int index){
        questions.remove(index);
    }



}
