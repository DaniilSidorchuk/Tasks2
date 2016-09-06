import org.junit.Test;
import tasks4.task1.Task4_1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class TestTask4_1 {
    @Test
    public void test() {
        int []a = {1, 3, 5};
        int []b = {2, 4, 8, 9, 12};
        int []c = new int [8];

        int [] exp = {1, 2, 3, 4, 5, 8, 9, 12};
        int [] act = Task4_1.main(a, b, c);
        assertThat(act, is(exp));
    }

}
