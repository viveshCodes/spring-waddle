package pb.io.peakyblinders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @GetMapping("/home")
    public String welcomePage(){
        return "Welcome to Peaky Blinders' World.";
    }
}
