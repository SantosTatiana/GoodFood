package pl.coderslab.Recipe;

import lombok.Data;
import pl.coderslab.Category.Category;
import pl.coderslab.User.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //kolumny w tabelkach
    private Long id;
    @NotNull(message = "To pole musi być wypełnione")
    private String name;
    @NotNull(message = "To pole musi być wypełnione")
    private String description;
    @NotNull(message = "To pole musi być wypełnione")
    private String preparation;
    @NotNull(message = "To pole musi być wypełnione")
    private int preparationTime;
    private java.time.LocalDateTime created;

    @NotNull(message = "To pole musi być wypełnione")
    private String ingredients;

    //Relacje między tabelkami
    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;

    //gettery&settery

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }
}