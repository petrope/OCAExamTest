package ocaexamtest.questions;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private ChapterType chapterType;
    private String text;
    private String codeSnippet;
    private List<Answer> answers;

    public Question(ChapterType chapterType, String text, String codeSnippet) {
        this.chapterType = chapterType;
        this.text = text;
        this.codeSnippet = codeSnippet;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer){
        answers.add(answer);
    }

    public void deleteAnswer(int index){
        answers.remove(index);
    }

    public ChapterType getChapterType() {
        return chapterType;
    }

    public String getText() {
        return text;
    }

    public String getCodeSnippet() {
        return codeSnippet;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
