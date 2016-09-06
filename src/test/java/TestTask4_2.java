import org.junit.Test;
import tasks4.task2.Task4_2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Даня on 06.09.2016.
 */
public class TestTask4_2 {
    @Test
    public void TestTask4_2(){
        int [] a = {1, 5, 7, 9, 12};
        int sum = 16;
        boolean ExpResult = true;
        boolean ActResult = Task4_2.test(a, sum);
        assertThat(ActResult, is(ExpResult));
    }
}
