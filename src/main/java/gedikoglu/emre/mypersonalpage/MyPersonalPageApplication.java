package gedikoglu.emre.mypersonalpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
@ComponentScan
@EnableConfigurationProperties(value=MyPersonalPageProperties.class)
@ServletComponentScan
public class MyPersonalPageApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MyPersonalPageApplication.class, args);
	}

}
