import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        String numbers = "";

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();

            numbers = numbers + number + " ";

            count++;
        }

        System.out.println("The numbers you entered are: " + numbers);
    }
}
