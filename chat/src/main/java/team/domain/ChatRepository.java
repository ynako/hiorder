package team.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "chats", path = "chats")
public interface ChatRepository
    extends PagingAndSortingRepository<Chat, String> {}
