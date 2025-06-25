// TODO ask for user name
//TODO how to make question??
public class Jackpot {
    private int title;
    private int option_1;
    private int option_2;
    private int option_3;
    private int option_4;
    private int correctAnswer;
    public Jackpot(int title,int option_1,int option_2,int option_3,int option_4,int correctAnswer ){
        this.title=title;
        this.option_1=option_1;
        this.option_2=option_2;
        this.option_3=option_3;
        this.option_4=option_4;
        this.correctAnswer= correctAnswer;
    }
    //user lai options and questions kasari display garanuni??
    public void display(){
        System.out.println("Title");
        System.out.println("1."+option_1);
        System.out.println("2."+option_2);
        System.out.println("3."+option_3);
        System.out.println("4."+option_4);
    }
    //TODO check if the input given by user is correct or not!!
    public boolean checkAnswer( int answer){
        return answer==this.correctAnswer;
        }
}
