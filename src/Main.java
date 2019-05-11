import java.awt.*;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        // tasks 1 - 3  => input
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Enter the width of Rectangle in centimetres: ");
        double width1 = scanner1.nextDouble();
        System.out.println("Enter the height of Rectangle in centimetres: ");
        double height1 = scanner1.nextDouble();
        double area1 = width1*height1;
        System.out.println("Area of Retangle in sq cm is: " + area1);

        Scanner scanner2 = new Scanner (System.in);
        System.out.println("Enter the width of Rectangle in centimetres: ");
        double width2 = scanner2.nextDouble();
        System.out.println("Enter the height of Rectangle in centimetres: ");
        double height2 = scanner1.nextDouble();
        double area2 = width2*height2;
        System.out.println("Area of Retangle in sq cm is: " + area2); */

        //  OR    task 1-3  => no input
        double w1 = 20;
        double h1 = 30;
        double area1 = w1*h1;
        System.out.println("Area of Rectangle in sq m is: " + area1);

        double w2 = 40;
        double h2 = 50;
        double area2 = w2*h2;
        System.out.println("Area of Rectangle in sq m is: \" " + area2);
        System.out.println("");


        // task 4
        int width3, peri, area3;
        Scanner scanner3 = new Scanner (System.in);

        System.out.println("Enter the width of square: ");
        width3 = scanner3.nextInt();

        area3 = width3*width3;
        peri = 4*width3;
        System.out.println("Area = \" " + area3);
        System.out.print("\nPerimeter = " + peri);
    }
}
