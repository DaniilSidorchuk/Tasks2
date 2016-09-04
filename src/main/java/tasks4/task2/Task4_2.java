package tasks4.task2;

/**
 2. Есть массив с числами упорядоченными по возрастанию, нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".

 Пример ввода:
 a = {1, 5, 7, 9, 12}
 sum = 12
 Результат:
 true - так как 5 + 7 = 12

 a = {1, 5, 7, 9, 12}
 sum = 3
 Результат:
 false - так как нет двух чисел, которые в сумме дают 3
 */
public class Task4_2 {
    public static void main(String[] args) {
        int [] a = {1, 5, 7, 9, 12};
        int sum = 16;
        boolean result = test(a, sum);
        System.out.println(result);
    }
    public static boolean test (int []a, int sum){
    int i = 0;
    int j = 1;
    boolean test = false;
        while (i<a.length && j<a.length){
            if ( sum == a[i] + a[j]){
                test = true;
                break;
            }
            if ( i == a.length-2 && j == a.length-1){
                test = false;
            }
            if (j != a.length-1){
                j++;
            }
            if (j == a.length-1 && i<a.length){
                i++;
                j= i++;
            }
        }
        return test;
    }
}
