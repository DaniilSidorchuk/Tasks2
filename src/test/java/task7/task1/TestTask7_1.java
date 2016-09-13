package task7.task1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class TestTask7_1 {
    int[] array = new int[100];
    int n = 9;

    @Test
    public void test(){
        int expResult = 55;
        int actResult = Task7_1.febon(n, array);
     assertThat(expResult, is(actResult));

    }

    @Test
    public void test2 (){
        int expResult = 55;
        int actResult = Task7_1.febonByRecursion(n, array);
        assertThat(expResult, is(actResult));
    }
}
