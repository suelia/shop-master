package team.whatdev.shop.utils.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("utils")
public class UtilsProperties {

    public String keyGeneration;

    public String getKeyGeneration() {
        return keyGeneration;
    }
    public void setKeyGeneration(String keyGeneration) {
        this.keyGeneration = keyGeneration;
    }
}
