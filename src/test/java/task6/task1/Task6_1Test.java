package task6.task1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Даня on 09.09.2016.
 */
public class Task6_1Test {
    @Test
    public void test (){
        String email = "daniilsidorchuk@gmail.com";
        String email1 = Task6_1.change(email);
        assertThat(email1, is("daniilsidorchukatgmaildotcom"));

    }
}
