package task14.StackAndCustomLinkedList;

/* 2. Определить есть ли цикл в созданном в классе CustomLinkedList
3. Вывести n-й от последнего элемент для CustomLinkedList */


public class CustomLinkedList {

    private Node firstNode;
    private Node lastNode;

    private class Node {
        String value;
        Node next;
    }

    public void add(String element) {
        Node node = new Node();
        node.value = element;

        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.next = node;
            lastNode = node;
        }
    }

    public void introduceCycle(int index) {
        Node current = firstNode;
        int currentIndex = 0;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        lastNode.next = current;
    }

    public boolean hasCycle() {
        Node turtle = firstNode;
        Node hare = firstNode.next;

        while (turtle.next != null){
            turtle = turtle.next;
            hare = hare.next.next;
            if (turtle == hare) return true;
        }

        return false;
    }

    public String nElementFromTheEnd (int n){

        Node current = firstNode;
        int index = 0;

        while (current != null){
            current = current.next;
            index++;
        }

        current = firstNode;
        for (int i = 0; i != index - n ; i++) {
            current = current.next;
        }

        return current.value;

    }

    @Override
    public String toString() {
        String result = "[";
        Node current = firstNode;
        while (current != null) {
            if (result.equals("["))
                result += current.value;
            else
                result += ", " + current.value;
            current = current.next;
        }
        result += "]";
        return result;
    }

}
