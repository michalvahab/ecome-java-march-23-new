package lessonn5;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        String numbers[] = {"firstNumber", "secondNumber", "thirdNumber"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int firstNumber = scanner.nextInt();
        numbers[0] = "firstNumber";

        System.out.println("Please enter number 2: ");
        int secondNumber = scanner.nextInt();
        numbers[1] = "secondNumber";

        System.out.println("Please enter number 3: ");
        int thirdNumber = scanner.nextInt();
        numbers[2] = "thirdNumber";


        int biggest = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        biggest = (thirdNumber > biggest) ? thirdNumber : secondNumber;
        System.out.println("the number is biggest" + " - " + biggest);



    }
}
