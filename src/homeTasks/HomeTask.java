package homeTasks;

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write  a number between 1-12");
        int month = input.nextInt();
        switch (month) {

            case 1:
                System.out.println("the month is January");
                break;


            case 2:
                System.out.println("the month is February");
                break;

            case 3:
                System.out.println("the month is March");
                break;

            case 4:
                System.out.println("the month is April");
                break;

            case 5:
                System.out.println("the month is May");
                break;

            case 6:
                System.out.println("the month is June");
                break;

            case 7:
                System.out.println("the month is July");
                break;

            case 8:
                System.out.println("the month is August");
                break;


            case 9:
                System.out.println("the month is September");
                break;

            case 10:
                System.out.println("the month is October");
                break;

            case 11:
                System.out.println("the month is November");
                break;

            case 12:
                System.out.println("the month is December");
                break;
            default:
                System.out.println("the month is not valid");
                break;


        }


    }
}
