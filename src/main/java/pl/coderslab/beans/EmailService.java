package pl.coderslab.beans;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

    @Override
    public void send() {
        System.out.println("Sending email");
    }

}
