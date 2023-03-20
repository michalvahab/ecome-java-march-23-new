package classTask;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a free number?");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("number"+"    "  +number+"   " + "is even" );
        }
        else System.out.println("number "+"  " +number+"  "+ "is not even");
    }
}
