package ocaexamtest;

public enum ChapterType {
    OCACH1("Java Building Blocks"),
    OCACH2("Operators and Statements"),
    OCACH3("Core Java APIs"),
    OCACH4("Mthods and Encapsulation"),
    OCACH5("Class Desing"),
    OCACH6("Exceptions");

    private String chapterTitle;

    ChapterType(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }
}
