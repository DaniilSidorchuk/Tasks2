package Task11.CustomArrayList;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

    public static void main(String[] args)  {
        CustomArrayList list = new CustomArrayList(5);
try {
    list.add("a");
}catch (Exception e){
    System.out.println(e.getMessage());
    e.printStackTrace();
}
        
        list.add("c");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.remove(1);
        System.out.println(list);


        System.out.println();
        System.out.println("Iterator example");
        Iterator iterator = list.randomIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }

}