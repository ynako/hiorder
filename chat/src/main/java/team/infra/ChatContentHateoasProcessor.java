package team.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import team.domain.*;

@Component
public class ChatContentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ChatContent>> {

    @Override
    public EntityModel<ChatContent> process(EntityModel<ChatContent> model) {
        return model;
    }
}
