package pl.coderslab.charity.institution;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/institutions")
public class InstitutionController {

    private final InstitutionDao institutionDao;

    public InstitutionController(InstitutionDao institutionDao) {
        this.institutionDao = institutionDao;
    }


    @GetMapping("/all")
    public List<Institution> getAll() {
        return institutionDao.findAll();
    }
}
