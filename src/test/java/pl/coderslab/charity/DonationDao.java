package pl.coderslab.charity;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DonationDao {

    @PersistenceContext
    private EntityManager entityManager;
    public void saveDonation(Donation donation) {
        entityManager.persist(donation);
    }



}
