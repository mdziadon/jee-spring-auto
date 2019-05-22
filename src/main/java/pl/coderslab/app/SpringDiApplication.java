package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.PersonService;
import pl.coderslab.homework.Customer;
import pl.coderslab.homework.CustomerLogger;
import pl.coderslab.homework.CustomerRepository;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage();

        CustomerLogger logger = context.getBean(CustomerLogger.class);
        logger.log("test");

        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
        customerRepository.addCustomer(new Customer(1L, "Jan", "Kowalski"));
        System.out.println(customerRepository.getCustomers());
    }
}
