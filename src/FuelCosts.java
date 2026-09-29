import java.util.Scanner;
public class FuelCosts {
    static void main() {
        /*
        * double tank
        * double fuelE
        * double fuelP
        * double costToDrive
        * double distance
        * double gallonsNeeded
        * String trash = ""
        * boolean done = false
        * do
        *   output "How many gallons of gas are in your tank? "
        *   if in.hasNextDouble
        *       tank = in.nextDouble
        *       in.nextLine
        *       done = true
        *   else
        *       trash = in.nextLine
        *       output "Invalid answer " + trash
        * while(!done)
        * done = false
        * do
         *   output "what is your MPG? "
         *   if in.hasNextDouble
         *       fuelE = in.nextDouble
         *      in.nextLine
         *       done = true
         *   else
         *       trash = in.nextLine
         *       output "Invalid answer " + trash
         * while(!done)
         * done = false
         * do
         *  output "What is the cost of gas? "
         *  if in.hasNextDouble
         *      fuelP = in.nextDouble
         *      in.nextLine
         *      done = true
         *  else
         *      trash = in.nextline
         *      output "Invalid answer " + trash
         * while(!done)
         * gallonsNeeded = 100 / fuelE
         * costToDrive = gallonsNeeded * fuelP
         * distance = fuelE * tank
         * output "To drive 100 miles it would cost: " + costToDrive + "With a full tank of gas you could drive: " + distance
        * */
        Scanner in = new Scanner(System.in);

        double tank = 0;
        double fuelE = 0;
        double fuelP = 0;
        double costToDrive = 0;
        double distance = 0;
        double gallonsNeeded = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("How many gallons of gas are in your tank? ");
            if (in.hasNextDouble()){
                tank = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid answer" + trash);
            }
        }
        while (!done);

        done = false;

        do {
            System.out.println("What is your MPG? ");
            if (in.hasNextDouble()){
                fuelE = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid answer" + trash);
            }
        }
        while (!done);

        done = false;

        do {
            System.out.println("What is the cost of gas? ");
            if (in.hasNextDouble()){
                fuelP = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid answer" + trash);
            }
        }
        while (!done);

        gallonsNeeded = (100 / fuelE);
        costToDrive = (gallonsNeeded * fuelP);
        distance = (fuelE * tank);
        System.out.println("To drive 100 miles it would cost: " + costToDrive + " With a full tank of gas you could drive: " + distance);


    }
}
