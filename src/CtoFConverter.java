import java.util.Scanner;

public class CtoFConverter {
    static void main() {
        /*
        * double tempC
        * double tempF
        * string trash ""
        * boolean done = false
        * do
        *   output "What is the temp in C: "
        *   if in.hasNextDouble
        *       tempC = in.nextDouble
        *       tempF = (tempC * 1.8) + 32
        *       output "The temp in F is: " + tempF
        *       in.nextLine()
        *       done = true;
        *   else
        *       trash = in.nextLine()
        *       output "Invalid temp: " + trash
        * while (!done);
        *
        * */

        Scanner in = new Scanner(System.in);

        double tempC;
        double tempF;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("What is the temp in C: ");
            if (in.hasNextDouble()){
                tempC = in.nextDouble();
                tempF = ((tempC * 1.8) + 32);
                System.out.println("The temp in F is: " + tempF);
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid temp: " + trash);
            }
        }
        while (!done);
    }
}
