package ocaexamtest.test;

public enum TestType {

    OCA("Oracle Certified Associate Java SE 8 Programmer certification"),
    OCP("Oracle Certified Professional Java SE 8 Programmer certification");

    private String type;


    TestType(String type) {
        this.type = type;

    }

    public String getType() {
        return type;
    }
}
