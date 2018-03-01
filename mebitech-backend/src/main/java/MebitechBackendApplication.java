import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.mebitechbackend"})
@ComponentScan({"com.example.mebitechbackend"})
@EntityScan("com.example.mebitechbackend")
@EnableJpaRepositories("com.example.mebitechbackend")
public class MebitechBackendApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MebitechBackendApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MebitechBackendApplication.class, args);
	}
}
