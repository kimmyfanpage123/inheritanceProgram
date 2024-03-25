public class NumericQuestion extends Question{
    public NumericQuestion(String question, String answer){
        super(question, answer);
    }
    public boolean isCorrect(String answer){
        return super.isCorrect(answer);
    }

    public void displayQuestion(){
        System.out.println(super.getQuestion());
    }
}
