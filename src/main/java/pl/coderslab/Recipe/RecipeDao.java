package pl.coderslab.Recipe;


import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class RecipeDao {

    @PersistenceContext
    private EntityManager entityManager;

    private void save(Recipe recipe) {
        entityManager.persist(recipe);
    }

    private void update(Recipe recipe) {
        entityManager.merge(recipe);
    }

    private void delate(Recipe recipe) {
        entityManager.remove(entityManager.contains(recipe) ? recipe : entityManager.merge(recipe));
    }


    public Recipe findById(Long id) {
        return entityManager.find(Recipe.class, id);
    }

    public List getList() {
//        return entityManager.createQuery("select description, name from Recipe ").getResultList();
        return entityManager.createQuery("select b from Recipe b").getResultList();
    }


}
