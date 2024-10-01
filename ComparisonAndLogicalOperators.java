import java.util.Scanner;

public class ComparisonAndLogicalOperators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is 4 * 6? ");
        int score = 0;
        int userAnswer = scan.nextInt();
        int correctAnswer = 4 * 6;
        System.out.println("User's answer: " + userAnswer + " Correct answer: " + correctAnswer);
        if (userAnswer == correctAnswer) {
            score = score + 1;
            System.out.println("Due to answering correctly, your score is " + score);
        }
        else {
            System.out.println("Unfortunately, your answer is not correct.");
        }
    } 
}
