package team.whatdev.shop.utils.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import team.whatdev.shop.utils.conditional.RandomConditional;
import team.whatdev.shop.utils.constant.UtilsProperties;
import team.whatdev.shop.utils.random.RandomText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@EnableConfigurationProperties(UtilsProperties.class)
public class RandomTextConfig {

    @Autowired
    UtilsProperties utilsProperties;

    @Bean
    @Conditional(RandomConditional.class)
    public RandomText randomText(){
        List<String> list = new ArrayList<>();
        if(utilsProperties.getRandom().isUpCase()){
            list.addAll(Arrays.asList(utilsProperties.getRandom().getUpChars()));
        }
        if(utilsProperties.getRandom().isLowCase()){
            list.addAll(Arrays.asList(utilsProperties.getRandom().getLowChars()));
        }
        if(utilsProperties.getRandom().isNumber()){
            list.addAll(Arrays.asList(utilsProperties.getRandom().getNumbers()));
        }
        if(list.size() < utilsProperties.getRandom().getCount()){
            throw new Error("随机数Bean 中获取数值超出字符池最大限度。");
        }
        return new RandomText(list, utilsProperties.getRandom().getCount());
    }

}
