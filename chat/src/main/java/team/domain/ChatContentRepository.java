package team.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "chatContents",
    path = "chatContents"
)
public interface ChatContentRepository
    extends PagingAndSortingRepository<ChatContent, String> {}
