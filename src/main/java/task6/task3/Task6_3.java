package task6.task3;


import java.util.Scanner;

public class Task6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        phrase = phrase.trim();
        String[] array = phrase.split(" ");
        int qtty = 0;
        boolean test;
        for (int i = 0; i < array.length; i++) {
            test = test(array[i]);
            if (test) {
                qtty++;
            }
        }
        if (qtty == 0) {
            System.out.println("There isn`t any palindromes in the text");
        }
        if (qtty == 1) {
            System.out.println("There is 1 palindrome in the text");
        }
        if (qtty > 1) {
            System.out.println("There are " + qtty + " palindrome in the text");
        }
    }
    private static boolean test(String s) {
String b = new StringBuffer(s).reverse().toString();
        boolean test = b.equals(s);
        return test;

        }
    }

