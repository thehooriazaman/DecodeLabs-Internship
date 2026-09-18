import java.util.Random; 
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
       
        //random generator
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
       
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumbers = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");
       
        //no of guesses
        do{
         System.out.println("Enter a guess:");
         guess = scanner.nextInt();
         attempts++;

         if(guess < randomNumbers){
            System.out.println("Too Low!");
      
        }else if(guess > randomNumbers){
            System.out.println("Too High!");
        
        }else{
            System.out.println("Correct! The number was:" + randomNumbers);
            System.out.println("You guessed it in " + attempts + " attempts.");
        }

      
        }   while(guess != randomNumbers);
              System.out.println("You Win!");
            scanner.close();
   }
         
}