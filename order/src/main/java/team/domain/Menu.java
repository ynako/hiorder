package team.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Menu_table")
@Data
public class Menu {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long menuId;

    private String menuName;
    private String description;
    private Integer price;
    private Boolean isAvailable;
    private String category;
    private Integer discount;
    private Integer todayOrderCount;
    private Integer accOrderCount;
    private Boolean isHot;
    private String imageUrl;
}
