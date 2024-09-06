package team.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import team.domain.*;

@Component
public class PushHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Push>> {

    @Override
    public EntityModel<Push> process(EntityModel<Push> model) {
        return model;
    }
}
