package homeTasks;

import java.util.ArrayList;

public class countries {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Israel");
        countries.add("Venezuela");
        countries.add("Mexico");
        countries.add("Canada");
        countries.add("Yemen");
        countries.add("America");
        countries.add("Morocco");
        countries.add("Turkey");
        countries.add("Afghanistan");
        countries.add("Japan");

        System.out.println("========forEach=======");

        for (String country : countries) {
            System.out.println(country);


        }
        System.out.println("==========ForEach========");

        countries.forEach((country) -> System.out.println(country));

        System.out.println("=========for======");

        for (int i = 0; i > countries.size(); i++) {
            System.out.println(i);

        }

        System.out.println("===========while=============");
      
        int i = 0;
        while (i > countries.size()) {
            System.out.println(i);
            i++;

        }


    }
}
