import java.util.Scanner;

public class ScoresAvg {
    public static void main(String[] args) {
        double score, sum = 0.0;
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=1; i<6; i++){
            System.out.print("Enter score #" + i + ": ");
            score = keyboard.nextDouble();
            while(score<0 || score >100)
            {
                 System.out.print("Out of range. Enter a score "
                        + "between 0 and 100: ");
                score = keyboard.nextDouble();
            }
            sum += score;
        }
        
        System.out.println("The average score is " + sum/5.0);
    }
    
}
