package pb.io.peakyblinders.repository;

import org.springframework.data.repository.CrudRepository;
import pb.io.peakyblinders.entity.Actor;

import java.util.List;
import java.util.Optional;

public interface ActorRepository extends CrudRepository<Actor, String> {

    public Optional<Actor> findByName(String name);
}
