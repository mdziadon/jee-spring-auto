package pl.coderslab.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Primary
public class FileCustomerLogger implements CustomerLogger {

    private String filename = "logger.log";

    @Override
    public void log(String message) {

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            FileWriter fileWriter = new FileWriter(filename, true);
            fileWriter.append(LocalDateTime.now().format(formatter)).append(": ").append(message).append("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
