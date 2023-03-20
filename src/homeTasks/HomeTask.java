package homeTasks;

import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write  a number between 1-12");
        int month = input.nextInt();
        switch (month) {
            // if (month==1)
            case 1:
                System.out.println("the month is January");
                break;

// if (month==2)
            case 2:
                System.out.println("the month is February");
                break;
            // if (month==3)
            case 3:
                System.out.println("the month is March");
                break;
            // if (month==4)
            case 4:
                System.out.println("the month is April");
                break;
            // if (month==5)
            case 5:
                System.out.println("the month is May");
                break;
            // if (month==6)
            case 6:
                System.out.println("the month is June");
                break;
            // if (month==7)
            case 7:
                System.out.println("the month is July");
                break;
            // if (month==8)
            case 8:
                System.out.println("the month is August");
                break;

            // if (month==9)
            case 9:
                System.out.println("the month is September");
                break;
            // if (month==10)
            case 10:
                System.out.println("the month is October");
                break;
            // if (month==11)
            case 11:
                System.out.println("the month is November");
                break;
            // if (month==12)
            case 12:
                System.out.println("the month is December");
                break;
            default:
                System.out.println("the month is not valid");
                break;


        }


    }
}
