package team.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import team.config.kafka.KafkaProcessor;
import team.domain.*;

@Service
public class MenuViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MenuRepository menuRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenAddCart_then_CREATE_1(@Payload AddCart addCart) {
        try {
            if (!addCart.validate()) return;

            // view 객체 생성
            Menu menu = new Menu();
            // view 객체에 이벤트의 Value 를 set 함
            menu.setMenuId(Long.valueOf(addCart.getMenuId()));
            // view 레파지 토리에 save
            menuRepository.save(menu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
