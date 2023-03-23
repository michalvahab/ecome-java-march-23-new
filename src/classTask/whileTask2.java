package classTask;

public class whileTask2 {
    public static void main(String[] args) {
        int summary = 0;
        int i = 0;
        while (i <= 500) {

            if (i % 7 == 0) {

                i++;
                summary += i;
                if (i % 4 == 0) {

                    continue;
                }
                System.out.println(i);
            }
            if (i == 100) {
                System.out.println("summary=" + summary);
                break;
            }


        }
    }
}




