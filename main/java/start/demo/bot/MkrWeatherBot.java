package start.demo.bot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.text.DecimalFormat;

@SpringBootApplication
public class MkrWeatherBot {

	public static void main(String[] args) {
		SpringApplication.run(MkrWeatherBot.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public DecimalFormat decimalFormat() {
		return new DecimalFormat("0.0");
	}

	@Bean
	public ModelMapper modelMapper() { return new ModelMapper(); }
}






