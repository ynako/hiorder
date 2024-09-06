package team.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.ChatApplication;

@Entity
@Table(name = "Chat_table")
@Data
//<<< DDD / Aggregate Root
public class Chat {

    @Id
    private String chatId;

    private String userId;

    private String managerId;

    public static ChatRepository repository() {
        ChatRepository chatRepository = ChatApplication.applicationContext.getBean(
            ChatRepository.class
        );
        return chatRepository;
    }
}
//>>> DDD / Aggregate Root
