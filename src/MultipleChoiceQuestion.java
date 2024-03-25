import java.util.ArrayList;
public class MultipleChoiceQuestion extends Question{
    private String choice1;
    private String choice2;
    private String choice3;
    private int answerNum;
    public MultipleChoiceQuestion(String question, String answer, String choice1, String choice2, String choice3){
        super(question, answer);
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
    }

    public String getChoice1(){
        return choice1;
    }

    public void setChoice1(String choice1){
        this.choice1 = choice1;
    }

    public String getChoice2(){
        return choice2;
    }

    public void setChoice2(String choice2){
        this.choice2 = choice2;
    }

    public String getChoice3(){
        return choice3;
    }

    public void setChoice3(String choice3){
        this.choice3 = choice3;
    }

    public boolean isCorrect(int answer){
        if (answer == answerNum){
            return true;
        }
        return false;
    }
    public void displayQuestion(){
        ArrayList<String> choices = new ArrayList<String>();
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);
        choices.add(super.getAnswer());

        System.out.println(super.getQuestion());
        for (int i = 0; i < 4; i++){
            int rand = (int)(Math.random() * choices.size());
            if (choices.get(rand).equals(super.getAnswer())){
                answerNum = rand + 1;
            }
            System.out.println((i + 1) + ". " + choices.remove(rand));
        }
    }
}
