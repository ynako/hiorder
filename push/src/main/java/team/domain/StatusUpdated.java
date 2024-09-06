package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class StatusUpdated extends AbstractEvent {

    private Long orderMenuId;
    private Long orderId;
    private Long menuId;
    private Integer quantity;
    private String menuStatus;
}
