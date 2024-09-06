package team.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "orderManagements",
    path = "orderManagements"
)
public interface OrderManagementRepository
    extends PagingAndSortingRepository<OrderManagement, Long> {}
