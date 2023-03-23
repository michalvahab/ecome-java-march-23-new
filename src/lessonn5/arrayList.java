package lessonn5;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
       arrayList.add(6);
        System.out.println(arrayList);
        arrayList.size();
        System.out.println( arrayList.size());
        arrayList.get(0);
        System.out.println(  arrayList.get(0));
        arrayList.set(0,50);
        System.out.println(  arrayList.set(0,50));
        System.out.println(arrayList);
        arrayList.get(0);
        System.out.println( arrayList.get(0));
        arrayList.indexOf(50);
        System.out.println(arrayList.indexOf(50));
        arrayList.contains(50);
        System.out.println( arrayList.contains(50));
        arrayList.add(20);
        System.out.println(arrayList);
arrayList.indexOf(20);
        System.out.println(arrayList.indexOf(20));
        arrayList.contains(20);
        System.out.println( arrayList.contains(20));
        ArrayList<String>namesList=new ArrayList<>();
        namesList.add("michal");
        namesList.add("nizan");
        namesList.add("david");
        System.out.println(namesList);
        namesList.remove("michal");
        System.out.println(namesList);
        namesList.set(1,"michal");
        System.out.println(namesList);
        namesList.size();
        System.out.println( namesList.size());

    };
}
