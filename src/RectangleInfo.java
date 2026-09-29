/*
*
* double length
* double height
* double area
* double perimeter
* double preDiagonal
* double diagonal
* string trash = ""
* boolean done = false
* do
*   output "What is the length of your retangle"
*   if in.nexthasdouble
*       length = in.nexthasdouble
*       in.nextLine
*       done = true
*   else
*
*
*
* */

import java.util.Scanner;
public class RectangleInfo {
    static void main() {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("What is the width of your rectangle: ");
            if (in.hasNextDouble()){
                width = in.nextDouble();
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
            System.out.println("What is the height of your rectangle: ");
            if (in.hasNextDouble()){
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid answer" + trash);
            }
        }
        while (!done);

        perimeter = ((width * 2) + (height *2));
        area = width * height;
        diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("The area of your rectangle is " + area + " The perimeter of your rectangle is " + perimeter + " The diagonal of your rectangle is " + diagonal);
    }
}
