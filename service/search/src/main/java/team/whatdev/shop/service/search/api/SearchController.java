package team.whatdev.shop.service.search.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/index")
    public String index(){
        return "This is Search-Server";
    }

}
