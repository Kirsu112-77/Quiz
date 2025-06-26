import java.util.Scanner;
public class ActualQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
    Jackpot[] questions = {new Jackpot("How many tentacles does octopus have?", 1, 4, 5, 8, 8),
            new Jackpot("How many province are there in Nepal?", 5, 8, 6, 7, 7),
            new Jackpot("How many bones does a newborn baby have?", 250, 400, 300, 330, 300),
            new Jackpot("What does X in Roman numerals stand for?", 9, 10, 11, 12, 10),
            new Jackpot("What comes after 99,990?", 999991, 100000, 999100, 999999, 999991),
            new Jackpot("How many sides does octagon have?", 6, 8, 9, 5, 8),
            new Jackpot("When a number is multiplied by zero,what will be the product?", 2, 1, 0, 4, 0),
            new Jackpot("How many colours does a rainbow have?", 5, 6, 7, 8, 7),
            new Jackpot("How many players are there in a cricket team", 10, 15, 9, 11, 11),
            new Jackpot("How many kilobytes equal 1 megabyte?", 1000, 500, 750, 1024, 1024)
    };
    int score=0;
    for(question=0;question<=10;question++){
        System.out.println("Question:");
        question[i].display();





}
}
