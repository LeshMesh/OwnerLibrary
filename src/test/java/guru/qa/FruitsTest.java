package guru.qa;

import guru.qa.config.FruitsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FruitsTest {

    @Test
    public void testArray() {
        System.setProperty("array", "apple,orange,banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray()).containsExactly("apple", "orange", "banana");
    }

    @Test
    public void testList() {
        System.setProperty("list", "apple,orange,banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
//        assertThat(config.getFruitsList()).containsExactly("apple", "orange", "banana");
    }

    @Test
    public void tesArrayWithDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArrayWithDefault()).containsExactly("orange, apple");
    }

    @Test
    public void testListWithSeparator() {
        System.setProperty("list-with-separator", "apple;orange;banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
//        assertThat(config.getFruitsListWithSeparator()).containsExactly("apple", "orange", "banana");
    }
}
