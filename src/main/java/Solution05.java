import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args){
        /*
        Print - What is the first number?
            Input = num1
        Print - What is the second number?
            Input = num2
        Convert num1 to an int
            num1 = int1
        Convert num2 to an int
            num2 = int2
        Calculate the numbers
           int sum = int1 + int2;
           int difference = int1 - int2;
           int product = int1 * int2;
           int quotient = int1 / int2;
        Print Solution
            num1 + num2 = sum
            num1 - num2 = difference
            num1 * num2 = product
            num1 / num2 = quotient
         */
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String num1 = input.nextLine();

        System.out.print("What is the second number? ");
        String num2 = input.nextLine();

        int int1 = Integer.parseInt(num1);
        int int2 = Integer.parseInt(num2);

        int sum = int1 + int2;
        int difference = int1 - int2;
        int product = int1 * int2;
        int quotient = int1 / int2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
    }
}
