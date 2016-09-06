package task5.task1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Даня on 06.09.2016.
 */
public class TestTask5_1 {
    Task5_1Flashlight flashlight;
    @Before
    public void setUp(){
        flashlight = new Task5_1Flashlight();
        flashlight.mod = "white";
        flashlight.battery();

    }
    @Test
    public void battery (){
        assertThat(flashlight.battery, is(1));
    }

}
