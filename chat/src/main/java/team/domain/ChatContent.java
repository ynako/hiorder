package team.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.ChatApplication;
import team.domain.MessageSent;

@Entity
@Table(name = "ChatContent_table")
@Data
//<<< DDD / Aggregate Root
public class ChatContent {

    @Id
    private String chatContentId;

    private String chatId;

    private String content;

    private String createdAt;

    private String senderId;

    private String receiverId;

    @PostPersist
    public void onPostPersist() {
        MessageSent messageSent = new MessageSent(this);
        messageSent.publishAfterCommit();
    }

    public static ChatContentRepository repository() {
        ChatContentRepository chatContentRepository = ChatApplication.applicationContext.getBean(
            ChatContentRepository.class
        );
        return chatContentRepository;
    }
}
//>>> DDD / Aggregate Root
