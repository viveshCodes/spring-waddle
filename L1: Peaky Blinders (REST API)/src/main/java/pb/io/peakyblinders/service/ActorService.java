package pb.io.peakyblinders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pb.io.peakyblinders.entity.Actor;
import pb.io.peakyblinders.repository.ActorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getActors(){
        List<Actor> actors = new ArrayList<>();

        actorRepository.findAll()
                .forEach(actors::add);
        return actors;
    }

    public Optional<Actor> getActorById(String id){
       return actorRepository.findById(id);
    }

    public void addActor(Actor actor){
        actorRepository.save(actor);
    }

    public Optional<Actor> getActorByName(String name){
        return actorRepository.findByName(name);
    }
    public void updateActor(Actor actor){
        actorRepository.save(actor);
    }

    public void deleteActor(String id){
        actorRepository.deleteById(id);
    }

}
