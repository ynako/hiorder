package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class MessageSent extends AbstractEvent {

    private String chatContentId;
    private String content;
    private String createdAt;
    private String senderId;
    private String receiverId;
    private String chatId;
}
