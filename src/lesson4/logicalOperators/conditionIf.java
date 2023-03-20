package lesson4.logicalOperators;

import java.util.Scanner;

public class conditionIf {
    public static void main(String[] args) {
        int a = 18;
        if (a > 18) {
            System.out.println("you are adult!");
        } else if (a == 18) {
            System.out.println("you are 18 years old!");

        } else {
            System.out.println("you ara a child!");
        }


        Scanner input = new Scanner(System.in);
        System.out.println("whats your age?");
        int age = input.nextInt();
        if (age > 18) {
            System.out.println("you are adult!");
        } else if (age == 18) {
            System.out.println("you are 18 years old!");

        } else {
            System.out.println("you ara a child!");
        }
    }
}




