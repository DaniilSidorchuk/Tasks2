package additional.task14.ArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task14_1 {

    public static void main(String[] args) {
        int nElement = 0;


        ArrayList <Integer> array = new ArrayList();
        for (int i = 1; i == 1001 ; i++) {
            array.add(i);
        }
        nElement = array.get(1);
        nElement = array.get(5);
        nElement = array.get(50);
        nElement = array.get(900);

        array.set(1,99);
        array.set(5,99);
        array.set(50,99);
        array.set(900,99);

        array.remove(1);
        array.remove(5);
        array.remove(50);
        array.remove(900);


        LinkedList<Integer> linked = new LinkedList<Integer>();
        for (int i = 1; i == 1001 ; i++) {
        linked.add(i);
        }
        nElement = linked.get(1);
        nElement = linked.get(5);
        nElement = linked.get(50);
        nElement = linked.get(900);

        linked.set(1,99);
        linked.set(5,99);
        linked.set(50,99);
        linked.set(900,99);

        linked.remove(1);
        linked.remove(5);
        linked.remove(50);
        linked.remove(900);

    }
    
}
