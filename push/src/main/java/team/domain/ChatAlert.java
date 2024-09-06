package team.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ChatAlert extends AbstractEvent {

    private Long id;

    public ChatAlert(Push aggregate) {
        super(aggregate);
    }

    public ChatAlert() {
        super();
    }
}
//>>> DDD / Domain Event
