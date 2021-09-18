package pb.io.peakyblinders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pb.io.peakyblinders.entity.PeakyBlinder;
import pb.io.peakyblinders.repository.PeakyBlinderRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PeakyBlinderService {

    @Autowired
    private PeakyBlinderRepository peakyBlinderRepository;

     private List<PeakyBlinder> peakyBlinders = new ArrayList<>(Arrays.asList(
             new PeakyBlinder("TS01", "Thomas Shelby", "War veteran, leader of back-street razor gang, criminal entrepreneur, legitimate bookmaker, captain of industry, and now member of parliament, Tommy Shelby’s rise through British society has been astronomic"),
             new PeakyBlinder("AS02", "Arthur Shelby", "Tommy’s older brother, his attack-dog, who has tried to settle into normal life but can’t."),
             new PeakyBlinder("LS03", "Lizzie Shelby", "Lizzie was a working girl who continued to work for Tommy through the 1920s.")
        ));

     public List<PeakyBlinder> getPeakyBlinders(){

        List<PeakyBlinder> peakyBlinders = new ArrayList<>();

        // Iterate over response returned by findAll()
         peakyBlinderRepository.findAll().
                 forEach(peakyBlinders::add);
         return peakyBlinders;
     }

     public Optional<PeakyBlinder> getIdBasedPeakyBlinder(String id){
         return peakyBlinderRepository.findById(id);
     }

     public void addPeakyBlinder(PeakyBlinder peakyBlinder){

         peakyBlinderRepository.save(peakyBlinder);
     }

     public void updatePeakyBlinder(PeakyBlinder peakyBlinder) {
        peakyBlinderRepository.save(peakyBlinder);
    }

    public void deletePeakyBlinder(String id) {
        peakyBlinderRepository.deleteById(id);
    }
}
