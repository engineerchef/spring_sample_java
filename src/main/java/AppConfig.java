import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.tolgaduran.repository.CustomerRepository;
import com.tolgaduran.repository.HibernateCustomerRepositoryImpl;
import com.tolgaduran.service.CustomerService;
import com.tolgaduran.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.tolgaduran"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		// CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		
		// service.setCustomerRepository(getCustomerRepository());

		return service;
	}*/

	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/
}
