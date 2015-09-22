package demo;

import com.pentacomp.pentazarcie.repo.GroupRepository;
import com.pentacomp.pentazarcie.repo.PlaceRepository;
import com.pentacomp.pentazarcie.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@EnableMongoRepositories(basePackages = "com.pentacomp.pentazarcie.repo")
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private PlaceRepository placeRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private GroupRepository groupRepository;

	@Autowired
	private com.pentacomp.pentazarcie.repo.PlaceRepository repository;

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
