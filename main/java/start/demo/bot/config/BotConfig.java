package start.demo.bot.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@NoArgsConstructor
@Getter
@PropertySource("/application.properties")
public class BotConfig {

    @Value("mkrweatherbot")
    private String botName;

    @Value("7280924426:AAHUcd0jwkgiKM9uDJXByWoqpJeKWyI5F8U")
    private String botToken;

    public BotConfig(String botName, String botToken) {
        this.botName = botName;
        this.botToken = botToken;
    }

}
