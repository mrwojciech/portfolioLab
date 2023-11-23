package pl.coderslab.charity.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CategoryDao extends JpaRepository<Category, Long> {

    List<Category> findAll();
}
