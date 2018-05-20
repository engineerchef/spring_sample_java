import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tolgaduran.service.CustomerService;

public class Application {

	private static ApplicationContext appContext;

	public static void main(String[] args) {

		appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// CustomerService service = new CustomerServiceImpl();

		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service);
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
