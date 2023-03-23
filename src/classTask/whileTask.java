package classTask;

public class whileTask {
    public static void main(String[] args) {
        String names[]={"michal","david"};
        int i=0;
        while (i<names.length){
            System.out.println(i+"."+names[i]);
            i++;
        }
        int b=0;
        while (b<20) {
          b++;
            if (b%5==0) {
                continue;
            }
            System.out.println(b);

        }



    }
}
