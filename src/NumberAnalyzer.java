
import java.util.Scanner;
public class NumberAnalyzer {

    public static void main(String[] args) {

       // printNumbersDescending();
       // printEvenOrOdd();
        // System.out.println(checkNumberType(-3));
      // System.out.println(calculateSum(10, 20));

        Scanner input = new Scanner(System.in);
        int choice;


     //method1
    /*public static void printNumbersDescending() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }
     //method2
    public static void printEvenOrOdd() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {

                System.out.println(i + " -> Even");

            } else {

                System.out.println(i + " -> Odd");

            }
        }
    }
    // Method 3
    /* public static String checkNumberType(int number) {

        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }

    }
    //method4
    /*public static int calculateSum(int number1, int number2) {

        return number1 + number2;

    }*/

    //Display the following menu repeatedly using a Do While Loop:

 do {

        System.out.println("===== Number Analyzer Menu =====");
        System.out.println("1 - Print Numbers Descending");
        System.out.println("2 - Print Even or Odd");
        System.out.println("3 - Check Number Type");
        System.out.println("4 - Calculate Sum");
        System.out.println("5 - Exit");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {

            case 1:
                printNumbersDescending();
                break;

            case 2:
                printEvenOrOdd();
                break;

            case 3:
                System.out.print("Enter a number: ");
                int number = input.nextInt();

                System.out.println("Number Type: " + checkNumberType(number));
                break;

            case 4:
                System.out.print("Enter first number: ");
                int number1 = input.nextInt();

                System.out.print("Enter second number: ");
                int number2 = input.nextInt();

                System.out.println("Sum = " + calculateSum(number1, number2));
                break;

            case 5:
                System.out.println("Thank you for using Number Analyzer!");
                break;

            default:
                System.out.println("Invalid Choice");
        }

    } while (choice != 5);

        input.close();
}

/**
 * Prints numbers from 10 to 1 in descending order.
 */
public static void printNumbersDescending() {

    for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }

}

/**
 * Checks whether numbers from 1 to 10 are even or odd.
 */
public static void printEvenOrOdd() {

    for (int i = 1; i <= 10; i++) {

        if (i % 2 == 0) {
            System.out.println(i + " -> Even");
        } else {
            System.out.println(i + " -> Odd");
        }

    }

}

/**
 * Checks whether a number is positive, negative, or zero.
 *
 * @param number the number to check
 * @return Positive, Negative, or Zero
 */
public static String checkNumberType(int number) {

    if (number > 0) {
        return "Positive";
    } else if (number < 0) {
        return "Negative";
    } else {
        return "Zero";
    }

}

/**
 * Calculates the sum of two numbers.
 *
 * @param number1 the first number
 * @param number2 the second number
 * @return the sum of the two numbers
 */
public static int calculateSum(int number1, int number2) {

    return number1 + number2;

}

}




