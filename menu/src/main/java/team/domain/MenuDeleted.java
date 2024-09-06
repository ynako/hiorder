package team.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MenuDeleted extends AbstractEvent {

    private Long menuId;

    public MenuDeleted(Menu aggregate) {
        super(aggregate);
    }

    public MenuDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
