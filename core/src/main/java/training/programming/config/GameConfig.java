package training.programming.config;

import training.programming.annotations.GuessCount;
import training.programming.annotations.MaxNumber;
import training.programming.annotations.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "training.programming")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    @Value("${game.maxNumber:100}")
    private int maxNumber;

    @Value("${game.minNumber:0}")
    private int minNumber;

    @Value("${game.guessCount:8}")
    private int guessCount;

    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }

}
