package pl.coderslab.charity.donation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.category.CategoryDao;
import pl.coderslab.charity.institution.InstitutionDao;

@Controller
@RequestMapping("/donations")
public class DonationController {

    private final CategoryDao categoryDao;
    private final InstitutionDao institutionDao;

    public DonationController(CategoryDao categoryDao, InstitutionDao institutionDao) {
        this.categoryDao = categoryDao;
        this.institutionDao = institutionDao;
    }

    @GetMapping("/add")
    public String createDonation(Model model) {
        model.addAttribute("categories",categoryDao.findAll());
        model.addAttribute("donation", new Donation());
        Integer quantity = null;
        model.addAttribute("quantity", quantity);
        model.addAttribute("institutions",institutionDao.findAll());
        return "form";
    }
}
