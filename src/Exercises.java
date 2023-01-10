public class Exercises {
    private String title;
    private String statement;
    private String answer;
    private String subjects;

    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    void setStatement(String statement) {
        this.statement = statement;
    }

    String getStatement() {
        return this.statement;
    }

    void setAnswer(String answer) {
        this.answer = answer;
    }

    String getAnswer() {
        return this.answer;
    }

    void setSubject(String subjects) {
        this.subjects = subjects;
    }

    String getSubject() {
        return this.subjects;
    }

    String addExercice(String title, String statement, String answer, String subjects) {
        this.setTitle(title);
        this.setStatement(statement);
        this.setAnswer(answer);
        this.setSubject(subjects);
        return "Novo exercício cadastrado!";
    }
}
