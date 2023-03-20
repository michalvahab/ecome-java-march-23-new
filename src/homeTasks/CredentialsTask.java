package homeTasks;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        String savedUsername = "michalvahab";

        String savedPassword = "Mv";


        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);


        System.out.println("write your username");
        String username = input.nextLine();
        System.out.println("write your password");
        String password = input2.nextLine();
        if (savedUsername.equals(username) && savedPassword.equals(password)) {
            System.out.println("welcome to michalvahab ");


        }
        else {
            System.out.println("No such user exists");
    }



    }
}
