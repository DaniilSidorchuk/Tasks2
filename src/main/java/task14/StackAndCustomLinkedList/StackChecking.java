package task14.StackAndCustomLinkedList;


import java.util.Stack;

public class StackChecking {

    public static void main(String[] args) {
        String brackets = "([{([])}])";
        String brackets2 = "((([]])))";
        String brackets3 = "({[]()})";

        boolean result =  bracketsChecking(brackets);
        boolean result2 = bracketsChecking(brackets2);
        boolean result3 = bracketsChecking(brackets3);

        printResult(result, brackets);
        printResult(result2, brackets2);
        printResult(result3, brackets3);


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

        for (int i = 0; i < length ; i++) {
            stack.push(brackets.charAt(i));
        }
        for (int i = 0; i < length; i++) {
            Object object = stack.pop();
            String bracket = object.toString();
            if (bracket.equals("(") || bracket.equals(")")) type1++;
            if (bracket.equals("[") || bracket.equals("]")) type2++;
            if (bracket.equals("{") || bracket.equals("}")) type3++;
        }

        if (type1%2==0 && type2%2==0 && type3%2==0) return true;
        else return false;



    }

}
