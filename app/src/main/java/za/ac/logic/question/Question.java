package za.ac.logic.question;

public class Question {

    private String questionStr;
    private boolean response;

    public Question() {
    }

    public Question(String questionStr, boolean response) {
        this.questionStr = questionStr;
        this.response = response;
    }

    public String getQuestionStr() {
        return questionStr;
    }

    public void setQuestionStr(String questionStr) {
        this.questionStr = questionStr;
    }

    public boolean getResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
}
