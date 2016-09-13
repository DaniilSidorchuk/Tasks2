package task7.task1;


public class Task7_1 {

    static int i = 2;

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
}
