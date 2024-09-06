package team.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import team.config.kafka.KafkaProcessor;
import team.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StatusUpdated'"
    )
    public void wheneverStatusUpdated_OrderStatus(
        @Payload StatusUpdated statusUpdated
    ) {
        StatusUpdated event = statusUpdated;
        System.out.println(
            "\n\n##### listener OrderStatus : " + statusUpdated + "\n\n"
        );

        // Sample Logic //
        Push.orderStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MessageSent'"
    )
    public void wheneverMessageSent_ChatPopUp(
        @Payload MessageSent messageSent
    ) {
        MessageSent event = messageSent;
        System.out.println(
            "\n\n##### listener ChatPopUp : " + messageSent + "\n\n"
        );

        // Sample Logic //
        Push.chatPopUp(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
