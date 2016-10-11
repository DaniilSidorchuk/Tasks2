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
        int type11 = 0;
        int type2 = 0;
        int type22 = 0;
        int type3 = 0;
        int type33 = 0;

        for (int i = 0; i < length ; i++) {
            stack.push(brackets.charAt(i));
            if (brackets.charAt(i)== '(') type1++;
            if (brackets.charAt(i)== ')') type11++;
            if (brackets.charAt(i)== '[') type2++;
            if (brackets.charAt(i)== ']') type22++;
            if (brackets.charAt(i)== '{') type3++;
            if (brackets.charAt(i)== '}') type33++;
        }
        if (type1==type11 && type2==type22 && type3==type33)return true;
        else return false;

    }

}
