package pl.coderslab.beans;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements MessageService {

    @Override
    public void send() {
        System.out.println("Sending sms");
    }
}
