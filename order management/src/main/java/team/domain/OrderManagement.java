package team.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "OrderManagement_table")
@Data
public class OrderManagement {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderMenuId;

    private Long orderId;
    private Long menuId;
    private Integer quantity;
    private String menuStatus;
}
