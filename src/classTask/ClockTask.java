package classTask;

import java.util.Scanner;

public class ClockTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What time is it now? written in four digits");
        int time = input.nextInt();
        System.out.println(time / 100 + ":" + time % 100);


    }
}
