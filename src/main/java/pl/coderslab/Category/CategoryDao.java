package pl.coderslab.Category;

import org.springframework.stereotype.Repository;
import pl.coderslab.Notes.Notes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Category findById(Long id) {
        return entityManager.find(Category.class, id);
    }

    public List getList() {
        return entityManager.createQuery("select b from Category b").getResultList();
    }

    public List<Category> findAll() {
        return entityManager.createQuery("select p from Category p").getResultList();
    }

}
