package team.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StatusAlert extends AbstractEvent {

    private Long id;

    public StatusAlert(Push aggregate) {
        super(aggregate);
    }

    public StatusAlert() {
        super();
    }
}
//>>> DDD / Domain Event
