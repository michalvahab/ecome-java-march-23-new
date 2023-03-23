package homeTasks;

import java.util.Scanner;

public class CreditCardTask {
    public static void main(String[] args) {
        int savedCreditNumber = 12345678;
        String savedPassword = "password";

        Scanner scanner = new Scanner(System.in);
        for (int i = 5; i > 0; i--) {
            System.out.println("enter creditNumber");
            int creditNumber = scanner.nextInt();
            System.out.println("enter password");
            String password = scanner.nextLine();
            if ((savedCreditNumber == creditNumber) && (savedPassword.equals(password))) {
                System.out.println("welcome");
            }
             else{
                System.out.println("you made a mistake, try again");
              }
            if (i == 0) {
                System.out.println("the card has been blocked");
                break;
            }


        }

    }      }


