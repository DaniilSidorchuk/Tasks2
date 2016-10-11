package task14.StackAndCustomLinkedList;

public class CustomLinkedListMain {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");

        if (!list.hasCycle()) {
            System.out.println(list);
        }
        boolean result = list.hasCycle();

        System.out.println(list.nElementFromTheEnd(3));

    }

}
