package classTask;

public class free {
    public static void main(String[] args) {
        int a=50;
        a=30;
        int b=40;
        System.out.println("a="+a);
        System.out.println("b="+b);
        a-=15;
        System.out.println("a="+a);

        a++;
        System.out.println("a="+a);
        --a;
        System.out.println("a="+a);

        System.out.println(10+"=="+10+"="+(10==10));
        System.out.println((15+"!="+15+"="+(15!=15)));

        String name="michal";
        String firstname= "michal";
        System.out.println(name+"=="+firstname+"="+(name==firstname));
        String myName=new String("michal");
        System.out.println(name+"=="+myName+"="+(name==myName));
        System.out.println(name.equals(myName)+"=="+name.equals(myName));



    }
}
