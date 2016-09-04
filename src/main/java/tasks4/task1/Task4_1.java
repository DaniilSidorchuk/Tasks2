package tasks4.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 1. Есть 2 массива упорядоченных по возрастанию. Получите 3й массив, который объединит все эти элементы, но также в возрастающем порядке.

 Пример ввода:
 a = {1, 3, 5}
 b = {2, 4, 8, 9, 12}
 Результат:
 c = {1, 2, 3, 4, 5, 8, 9, 12}
 */
public class Task4_1 {
    public static void main(String[] args) {
        int []a = {1, 3, 5};
        int []b = {2, 4, 8, 9, 12};
        int []c = new int [8];

        int a1 = 0;
        int b1 = 0;
        int c1 = 0;

        while (c1<=c.length && b1<b.length && a1<a.length){
            if (a[a1] < b[b1] && a1<=a.length-1 && a[a1]!=0){
                c[c1] = a[a1];
                System.out.println(c[c1]);
                if (a1 == a.length-1){
                    a[a1] = 0;
                }
                if (a1<a.length-1)
                a1++;

            }else{
                c[c1] = b[b1];
                System.out.println(c[c1]);
                b1++;
        }
                c1++;
        }

    }
}
