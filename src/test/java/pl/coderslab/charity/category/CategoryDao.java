package pl.coderslab.charity.category;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CategoryDao {

    @PersistenceContext
    private EntityManager entityManager;
    public void saveCategory(Category category) {
        entityManager.persist(category);
    }
}
