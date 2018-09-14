package team.whatdev.shop.utils.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import team.whatdev.shop.utils.algorithm.KeyGeneration;


@Configuration
public class KeyGenerationConfig {

    @Bean
    @ConditionalOnProperty(value = "utils.key-generation", havingValue = "true", matchIfMissing = true)
    public KeyGeneration keyGeneration(){
        return new KeyGeneration();
    }

}
