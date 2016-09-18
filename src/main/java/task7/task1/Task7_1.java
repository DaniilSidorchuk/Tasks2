package task7.task1;


public class Task7_1 {

    static int i = 2;
    static int n1 = 1;
    static int n2 = 1;
    static int n3;

    public static int febon(int n,int array[] ) {
        array[0] = 1;
        array[1] = 1;

        for (i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    public static int febonByRecursion(int n, int array[]) {
        array[0] = 1;
        array[1] = 1;
        array[i] = array[i - 1] + array[i - 2];

        if (i !=n ) {
            i++;
            febonByRecursion(n, array);
        }

        return array[i];

    }

    public static int febonacci (int n) {
        if (n-1!=0) {
            n3 = n1 + n2;
            n2 = n1;
            n1 = n3;
            n--;
            febonacci(n);
        }
        return n3;
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
