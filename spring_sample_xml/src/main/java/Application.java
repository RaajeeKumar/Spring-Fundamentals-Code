import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		System.out.println(service);
		
		/*CustomerService service2 = appContext.getBean("customerService",CustomerService.class);
		System.out.println(service2);*/
		
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());

	}

}
