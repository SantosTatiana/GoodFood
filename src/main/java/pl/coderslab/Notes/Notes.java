package pl.coderslab.Notes;

import pl.coderslab.Recipe.Recipe;
import pl.coderslab.User.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //kolumny w tabelkach
    private Long id;
    private String message;
    private java.time.LocalDateTime created;

    //Relacje między tabelkami
    @ManyToOne
    private Recipe recipe;
    @ManyToOne
    private User user;

    //gettery&settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
