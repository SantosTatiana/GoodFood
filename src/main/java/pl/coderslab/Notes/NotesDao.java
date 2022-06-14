package pl.coderslab.Notes;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class NotesDao {

    @PersistenceContext
    private EntityManager entityManager;

    private void save(Notes notes) {
        entityManager.persist(notes);
    }

    private void update(Notes notes) {
        entityManager.merge(notes);
    }

    private void delate(Notes notes) {
        entityManager.remove(entityManager.contains(notes) ? notes : entityManager.merge(notes));
    }

    public Notes findById(Long id) {
        return entityManager.find(Notes.class, id);
    }

    public List getList() {
        return entityManager.createQuery("select b from Notes b").getResultList();
    }

}
