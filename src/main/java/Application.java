import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.asdbridge.service.ResourceService;

public class Application
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		// ResourceService service = new ResourceServiceImpl();

		ResourceService service = appContext.getBean("resourceService", ResourceService.class);
		System.out.println(service);

		System.out.println(service.findAll().get(0).getName());

	}
}
