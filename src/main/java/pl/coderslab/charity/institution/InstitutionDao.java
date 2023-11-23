package pl.coderslab.charity.institution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface InstitutionDao extends JpaRepository<Institution,Long> {

    public List<Institution> findAll();
}
