package pb.io.peakyblinders.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PeakyBlinder {

    // Field Section
    @Id
    private String id;
    private String name;
    private  String about;

    // Constructor section
    public PeakyBlinder() {
    }

    public PeakyBlinder(String id, String name, String about) {
        this.id = id;
        this.name = name;
        this.about = about;
    }

    // Getter section
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    // Setter section
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
