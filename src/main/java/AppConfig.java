import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.asdbridge" })
public class AppConfig
{
	/*
	 * @Bean(name = "resourceService") public ResourceService
	 * getresourceService() { // //resourceServiceImpl service = new //
	 * resourceServiceImpl(getresourceRepository());
	 * 
	 * ResourceServiceImpl service = new ResourceServiceImpl(); //
	 * service.setresourceRepository(getresourceRepository()); return service; }
	 * 
	 * @Bean(name = "resourceRepository") public ResourceRepository
	 * getresourceRepository() { return new ResourceRepositoryDataImpl(); }
	 */
}
