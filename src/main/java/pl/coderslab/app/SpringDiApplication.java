package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.MessageSender;
import pl.coderslab.beans.PersonService;
import pl.coderslab.homework.CustomerLogger;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage();

        CustomerLogger logger = context.getBean(CustomerLogger.class);
        logger.log();
    }
}
