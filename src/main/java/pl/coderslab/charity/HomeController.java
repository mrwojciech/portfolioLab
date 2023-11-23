package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.donation.DonationDao;
import pl.coderslab.charity.institution.InstitutionDao;


@Controller
public class HomeController {

    private final InstitutionDao institutionDao;
    private final DonationDao donationDao;

    public HomeController(InstitutionDao institutionDao, DonationDao donationDao) {
        this.institutionDao = institutionDao;
        this.donationDao = donationDao;
    }


    @RequestMapping("/")
    public String homeAction(Model model) {
        model.addAttribute("institutions", institutionDao.findAll());
        model.addAttribute("allDonationsBagsQuantity", donationDao.getAllDonationsBagsQuantity());
        model.addAttribute("allDonationsQuantity", donationDao.getAllDonationsQuantity());
        return "index";
    }
}
