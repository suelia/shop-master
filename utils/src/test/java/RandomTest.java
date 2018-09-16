import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.whatdev.shop.utils.config.RandomTextConfig;
import team.whatdev.shop.utils.constant.UtilsProperties;
import team.whatdev.shop.utils.random.RandomText;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RandomTextConfig.class)
public class RandomTest {

    @Autowired
    UtilsProperties utilsProperties;
    @Autowired
    RandomText randomText;

    @Test
    public void testRandom(){
        System.out.println(randomText.doRandom());
    }
}
