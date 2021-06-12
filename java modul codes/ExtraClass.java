package ExtraTasks.OnlineTest;

public class ExtraClass {
    private String questionTest,a,b,c,d,answer;

    public ExtraClass(String questionTest, String a, String b, String c, String d, String answer) {
        this.questionTest = questionTest;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.answer = answer;
    }

    public ExtraClass() {
    }

    public ExtraClass(String s) {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionTest() {
        return questionTest;
    }

    public void setQuestionTest(String questionTest) {
        this.questionTest = questionTest;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "ExtraClass{" +
                "questionTest='" + questionTest + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
