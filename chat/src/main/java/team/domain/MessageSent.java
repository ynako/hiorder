package team.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MessageSent extends AbstractEvent {

    private String chatContentId;
    private String content;
    private String createdAt;
    private String senderId;
    private String receiverId;
    private String chatId;

    public MessageSent(ChatContent aggregate) {
        super(aggregate);
    }

    public MessageSent() {
        super();
    }
}
//>>> DDD / Domain Event
