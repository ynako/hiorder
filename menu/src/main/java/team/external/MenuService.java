package team.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "order", url = "${api.url.order}")
public interface MenuService {
    @GetMapping(path = "/menus")
    public List<Menu> getMenu();

    @GetMapping(path = "/menus/{id}")
    public Menu getMenu(@PathVariable("id") Long id);
}
