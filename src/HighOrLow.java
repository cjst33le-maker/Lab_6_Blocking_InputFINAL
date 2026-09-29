import java.util.Scanner;
import java.util.Random;
public class HighOrLow {
    static void main() {

        Scanner in = new Scanner(System.in);

        Random generator = new Random();

        int val = generator.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Pick a number 1-10: ");
            if (in.hasNextInt()){
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid answer " + trash);
            }
        }
        while (!done);

        System.out.println("The random number was: " + val);

        if (val > guess){
            System.out.println("Your guess was too small");
        }
        else if (val < guess) {
            System.out.println("Your guess was to big");
        }
        else {
            System.out.println("Your on the money");
        }

    }}
