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
public class MenuManagementViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private MenuManagementRepository menuManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenMenuCreated_then_CREATE_1(
        @Payload MenuCreated menuCreated
    ) {
        try {
            if (!menuCreated.validate()) return;

            // view 객체 생성
            MenuManagement menuManagement = new MenuManagement();
            // view 객체에 이벤트의 Value 를 set 함
            menuManagement.setId(menuCreated.getMenuId());
            menuManagement.setName(menuCreated.getName());
            menuManagement.setDescription(menuCreated.getDescription());
            menuManagement.setPrice(menuCreated.getPrice());
            menuManagement.setIsAvailable(menuCreated.getIsAvailabie());
            menuManagement.setCategory(menuCreated.getCategory());
            menuManagement.setDiscount(menuCreated.getDiscount());
            menuManagement.setImageUrl(menuCreated.getImageUrl());
            // view 레파지 토리에 save
            menuManagementRepository.save(menuManagement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenMenuUpdated_then_UPDATE_1(
        @Payload MenuUpdated menuUpdated
    ) {
        try {
            if (!menuUpdated.validate()) return;
            // view 객체 조회

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenMenuDeleted_then_DELETE_1(
        @Payload MenuDeleted menuDeleted
    ) {
        try {
            if (!menuDeleted.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            menuManagementRepository.deleteById(menuDeleted.getMenuId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
