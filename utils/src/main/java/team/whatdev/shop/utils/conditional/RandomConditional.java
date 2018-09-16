package team.whatdev.shop.utils.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * 控制注入Bean
 * <pre>{@code
 *     @Override
 *         public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
 *                 Environment env = context.getEnvironment();
 *                 String number = env.getProperty("utils.random.number");
 *                 String lowCase = env.getProperty("utils.random.low-case");
 *                 String upCase = env.getProperty("utils.random.up-case");
 *                 return t.equals(number) || t.equals(lowCase) || t.equals(upCase);
 *             }
 * }</pre>
 */
public class RandomConditional implements Condition {

    private final String T = "true";

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        String number = env.getProperty("utils.random.number");
        String lowCase = env.getProperty("utils.random.low-case");
        String upCase = env.getProperty("utils.random.up-case");
        return T.equals(number) || T.equals(lowCase) || T.equals(upCase);
    }
}
