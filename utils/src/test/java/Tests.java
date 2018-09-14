import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.whatdev.shop.utils.algorithm.KeyGeneration;
import team.whatdev.shop.utils.exception.AlgorithmException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = KeyGeneration.class)
public class Tests {

    @Autowired
    KeyGeneration keyGeneration;

    /**
     * 测试MD5 加密是否可行
     */
    @Test
    public void testMD5(){
        String result = null;
        try {
            result = keyGeneration.doMD5Digest("111111");
        } catch (AlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    /**
     * 测试sha 加密是否可行
     */
    @Test
    public void testSha(){
        String result = null;
        try {
            result = keyGeneration.doSha1Digest("111111");
        } catch (AlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

}
