package team.whatdev.shop.utils.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("utils")
public class UtilsProperties {

    private String keyGeneration;

    private RandomProperties random;

    public RandomProperties getRandom() {
        return random;
    }

    public void setRandom(RandomProperties random) {
        this.random = random;
    }

    public String getKeyGeneration() {
        return keyGeneration;
    }
    public void setKeyGeneration(String keyGeneration) {
        this.keyGeneration = keyGeneration;
    }
}
