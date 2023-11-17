package pl.coderslab.charity.institution;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class InstitutionDao {

    @PersistenceContext
    private EntityManager entityManager;
    public void saveInstitution(Institution institution) {
        entityManager.persist(institution);
    }
}
