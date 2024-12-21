package ir.mbbn.sample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author m.biabani
 * created on 12/21/2024
 */
@Component("kafkaListener")
public class SampleKafkaListener {

    @KafkaListener(topics = "baeldung", groupId = "groupId")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
