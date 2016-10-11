package task14.StackAndCustomLinkedList;


import java.util.Stack;

public class StackChecking {

    public static void main(String[] args) {
        String brackets = "([{([])}])";
        String brackets2 = "((([]])))";
        String brackets3 = "({[]()})";
        String brackets4 = "({[}]())";

        boolean result =  bracketsChecking(brackets);
        boolean result2 = bracketsChecking(brackets2);
        boolean result3 = bracketsChecking(brackets3);
        boolean result4 = bracketsChecking(brackets4);

        printResult(result, brackets);
        printResult(result2, brackets2);
        printResult(result3, brackets3);
        printResult(result4, brackets4);


    }

    public static void printResult(boolean result, String brackets){
        if (result) System.out.println("Brackets " + brackets + " are balanced");
        else System.out.println("Brackets " + brackets + " are not balanced");
    }

    public static boolean bracketsChecking(String brackets) {
        int length = brackets.length();
        Stack stack = new Stack();
        int type1 = 0;
        int type2 = 0;
        int type3 = 0;



        char t1 = '(';
        char t11 = ')';
        char t2 = '[';
        char t22 = ']';
        char t3 = '{';
        char t33 = '}';

        for (int i = 0; i < length ; i++) {

            if (brackets.charAt(i)==t11 || brackets.charAt(i)==t22 || brackets.charAt(i)==t33){
                if (brackets.charAt(i)==t11){
                    if (stack.peek().toString().charAt(0)==t2 || stack.peek().toString().charAt(0)==t3){
                        stack.pop();
                        continue;
                    }}
                if (brackets.charAt(i)==t22){
                    if (stack.peek().toString().charAt(0)== t1 || stack.peek().toString().charAt(0)== t3){
                        stack.pop();
                        continue;
                    }}
                if (brackets.charAt(i)==t33){
                    if (stack.peek().toString().charAt(0)==t2 || stack.peek().toString().charAt(0)==t1){
                        stack.pop();
                        continue;
                    }}
            }
            stack.push(brackets.charAt(i));
        }
        if (stack.size()<length){
            return false;
        }else return true;
    }

}
