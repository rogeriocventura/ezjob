package ezjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = {"br.com.springboot.model"})
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class EzjobApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzjobApplication.class, args);
	}

}
