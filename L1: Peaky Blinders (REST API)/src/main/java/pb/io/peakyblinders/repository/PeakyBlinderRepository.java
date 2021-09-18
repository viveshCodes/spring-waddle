package pb.io.peakyblinders.repository;

import org.springframework.data.repository.CrudRepository;
import pb.io.peakyblinders.entity.PeakyBlinder;

/**
 * We need to specify generic types for CrudRepository
 * First type: The entity class name  (here, PeakyBlinder)
 * Second type: The data type of id of the entity class (here, String)
 **/

/**
 * With the help of CrudRepository, we can perform basic CRUD operations
 * without writing them explicitly.
 * **/
public interface PeakyBlinderRepository extends CrudRepository<PeakyBlinder, String> {


}
