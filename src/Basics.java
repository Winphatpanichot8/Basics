/**
 * Execises to practice the basic syntax
 */
public class Basics {

    public static void main(String[] args) {
        // TODO: Write a Java program to print the sum of two numbers.
        int x = 10;
        int y = 20;
        int result = x + y ;
       System.out.println("the sum is "+ result);

        // TODO: Write a Java program to divide two numbers and print on the screen. Use both integers and doubles
        double x1 = 20;
        double y1 = 60;
        double division;
        division =x1/y1;
        System.out.println("the quotient "+ division);

        // TODO: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        int a = 12;
        int b = 13;
        int addition;
        int product;
        int subtraction;
        double division1;
        addition = a+b;
        product = a*b;
        subtraction = a-b;
        division1 = a/b;
        System.out.println("the addition "+ addition);
        System.out.println(" the subtraction " + subtraction);
        System.out.println("the product "+ product);
        System.out.println("the division "+ division1);




        // TODO: Write a Java program to swap two variables. Print the before and after switching.
        int yyy, xxx;
        yyy = 5;
        xxx = 3;
        int tt = xxx;
        xxx = yyy;
        yyy = tt;
        System.out.print("\n" + xxx + "\n" + yyy);
    }
}
