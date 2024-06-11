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
public class OpenWeatherConfig {

    @Value("005d657dd9a167514dcb0c45e500bdd3")
    private String token;

}
