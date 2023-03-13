package homeTasks;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the first name?");
        String firstname = input.nextLine();
        System.out.println("what is the last name?");
        String lastname = input.nextLine();
        System.out.println("what is your city of residence?");
        String City = input.nextLine();
        System.out.println("what is your average grade?");
        double Average = input.nextDouble();
        System.out.println("what is your age?");
        int Age = input.nextInt();

        System.out.println("firstname = " + firstname);
        System.out.println("lastname = " + lastname);
        System.out.println("City = " + City);
        System.out.println("Average = " + Average);
        System.out.println("Age = " + Age);


    }

}
