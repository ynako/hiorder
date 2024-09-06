package team.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import team.PushApplication;

@Entity
@Table(name = "Push_table")
@Data
//<<< DDD / Aggregate Root
public class Push {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static PushRepository repository() {
        PushRepository pushRepository = PushApplication.applicationContext.getBean(
            PushRepository.class
        );
        return pushRepository;
    }

    //<<< Clean Arch / Port Method
    public static void orderStatus(StatusUpdated statusUpdated) {
        //implement business logic here:

        /** Example 1:  new item 
        Push push = new Push();
        repository().save(push);

        */

        /** Example 2:  finding and process
        
        repository().findById(statusUpdated.get???()).ifPresent(push->{
            
            push // do something
            repository().save(push);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void chatPopUp(MessageSent messageSent) {
        //implement business logic here:

        /** Example 1:  new item 
        Push push = new Push();
        repository().save(push);

        */

        /** Example 2:  finding and process
        
        repository().findById(messageSent.get???()).ifPresent(push->{
            
            push // do something
            repository().save(push);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
