package classTask;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer>nambersList=new ArrayList<>();
        double sammery=0;

        System.out.println("please enter firstNumber");
        int firstNumber= scanner.nextInt();
        System.out.println("please enter secondNumber");
        int secondNumberNumber= scanner.nextInt();
        System.out.println("please enter thirdNumber");
        int thirdNumberNumber= scanner.nextInt();
        nambersList.add(firstNumber);
        nambersList.add(secondNumberNumber);
        nambersList.add(thirdNumberNumber);
        sammery =((nambersList.get(0))+(nambersList.get(1))+(nambersList.get(2)))/3.0;
        System.out.println("aveage="+sammery);
        System.out.println(nambersList);

        int minimumNumber=(nambersList.get(0)<nambersList.get(1))?nambersList.get(0):nambersList.get(1);
        minimumNumber=(nambersList.get(2)<minimumNumber)?nambersList.get(2):nambersList.get(1);
        System.out.println("minimumNumber="+minimumNumber);










    }
}

