import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive numbers (-99 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            number = input.nextInt();

            // Stop when -99 is entered
            if (number == -99) {
                break;
            }

            // Validate negative numbers
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                continue;
            }

            // Calculate sum of squares
            sumOfSquares = sumOfSquares + (number * number);
            count++;
        }

        // Check if at least one number was entered
        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double rms = Math.sqrt(sumOfSquares / count);

            System.out.println("Number of values = " + count);
            System.out.println("Sum of squares = " + sumOfSquares);
            System.out.printf("Root Mean Square = %.2f%n", rms);
        }
    }
}
