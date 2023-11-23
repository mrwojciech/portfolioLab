package pl.coderslab.charity.donation;

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


    public Long getAllDonationsBagsQuantity() {
        return (Long) entityManager.createQuery("SELECT SUM(d.quantity) FROM Donation d").getSingleResult();
    }


    public Long getAllDonationsQuantity() {
        return (Long) entityManager.createQuery("SELECT COUNT(*) FROM Donation d").getSingleResult();
    }
}
