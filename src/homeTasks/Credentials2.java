package homeTasks;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
String login;

        String saveUsername = "fullName";

        String  savePassword = "password";


        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);



        System.out.println("write your username");
        String actualUsername = input.nextLine();
        System.out.println("write your password");
        String actualPassword =input2.nextLine();
        login= ((actualUsername.equals(saveUsername)) && ( savePassword.equals(actualPassword))) ?("welcome to" +actualUsername ):"No such user exists";





            }
    }

