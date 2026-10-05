import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        String numbers = "";

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();

            numbers = numbers + number + " ";
            sum = sum + number;

            count++;
        }

        double average = (double) sum / 10;

        System.out.println();
        System.out.println("The numbers you entered are: " + numbers);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
