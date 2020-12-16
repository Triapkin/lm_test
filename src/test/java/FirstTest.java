import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FirstTest {

    @Test(description = "test")
    public void firstTest() {
        List<Integer> listOfIntegers = Arrays.asList(10, 1, 3, 5, 7, 9, 10);
        int max = Collections.max(listOfIntegers);
        int min = Collections.min(listOfIntegers);
        int rand = ThreadLocalRandom.current().nextInt(min, max);

        assertThat(listOfIntegers).contains(rand);
    }

}
