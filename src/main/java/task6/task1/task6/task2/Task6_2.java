package task6.task1.task6.task2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;


public class Task6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String phrase = sc.nextLine();
        String [] array = phrase.split(" ");
        for (int i = 0; i<array.length; i++){
            array[i] = reduction(array[i]);
        }
        String result = Arrays.toString(array);
        System.out.println(result);
        }

    private static String reduction(String phrase) {
        int a = phrase.length();
        String number = valueOf(a-2);
        String middle;
        if (a > 3){
            middle = phrase.substring(1, a-1);
            phrase = phrase.replace(middle, number);
        }
return phrase;
    }

}
