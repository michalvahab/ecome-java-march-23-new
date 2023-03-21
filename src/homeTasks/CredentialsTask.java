package homeTasks;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {
        String saveUsername = "fullName";

        String  savePassword = "password";


        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);



        System.out.println("write your username");
        String actualUsername = input.nextLine();
        System.out.println("write your password");
        String actualPassword =input2.nextLine();
        if ((actualUsername.equals(saveUsername)) && ( savePassword.equals(actualPassword))) {
            System.out.println("welcome to" +actualUsername );


        } else
            System.out.println("No such user exists");
        }

}
