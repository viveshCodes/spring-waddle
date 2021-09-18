package pb.io.peakyblinders.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

    @Id
    private String id;
    private String name;
    private String wiki;

    // Constructors
    public Actor() {
    }

    public Actor(String id, String wiki, String name) {
        this.id = id;
        this.wiki = wiki;
        this.name = name;
    }


    // Getters
    public String getId() {
        return id;
    }

    public String getWiki() {
        return wiki;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public void setName(String name) {
        this.name = name;
    }
}
