package pb.io.peakyblinders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pb.io.peakyblinders.entity.PeakyBlinder;
import pb.io.peakyblinders.service.PeakyBlinderService;

import java.util.List;
import java.util.Optional;

@RestController
public class PeakyBlindersController {

    @Autowired
    private PeakyBlinderService peakyBlinderService;

    @GetMapping("/peakyblinders")
    public List<PeakyBlinder> getAllPeakyBlinders(){
        return peakyBlinderService.getPeakyBlinders();
    }

    @GetMapping("/peakyblinders/{id}")
    public Optional<PeakyBlinder> getIdBasedPeakyBlinder(@PathVariable String id){
        return peakyBlinderService.getIdBasedPeakyBlinder(id);
    }

    @PostMapping("/peakyblinders")
    public void addPeakyBlinder(@RequestBody PeakyBlinder peakyBlinder){
        peakyBlinderService.addPeakyBlinder(peakyBlinder);
    }

    @PutMapping("/peakyblinders/")
    public void updatePeakyBlinder(@RequestBody PeakyBlinder peakyBlinder){
        peakyBlinderService.updatePeakyBlinder(peakyBlinder);
    }

    @DeleteMapping("/peakyblinders/{id}")
    public void deletePeakyBlinder(@PathVariable String id){
        peakyBlinderService.deletePeakyBlinder(id);
    }
}
