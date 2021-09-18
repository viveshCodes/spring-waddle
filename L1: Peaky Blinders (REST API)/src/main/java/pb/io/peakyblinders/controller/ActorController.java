package pb.io.peakyblinders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pb.io.peakyblinders.entity.Actor;
import pb.io.peakyblinders.service.ActorService;

import java.util.List;
import java.util.Optional;

@RestController
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/actors")
    public List<Actor> getActors(){
       return actorService.getActors();
    }

    @GetMapping("/actors/{id}")
    public Optional<Actor> getActorById(@PathVariable String id){
        return actorService.getActorById(id);
    }

    // To remove ambiguity we'll add /list
    @GetMapping("/actors/list/{name}")
    public Optional<Actor> getActorByName(@PathVariable String name){
        return actorService.getActorByName(name);
    }
    @PostMapping("/actors")
    public void addActor(@RequestBody Actor actor){
        actorService.addActor(actor);
    }

    @PutMapping("/actors")
    public void updateActor(@RequestBody Actor actor){
        actorService.updateActor(actor);
    }

    @DeleteMapping("/actors/{id}")
    public void deleteActor(@PathVariable String id){
        actorService.deleteActor(id);
    }
}
