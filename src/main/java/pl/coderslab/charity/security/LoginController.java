package pl.coderslab.charity.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.charity.UserService;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String getLoginView() {
        return "login";
    }

    @GetMapping("/logot")
    public String getLogoutView(HttpSession session) {
        session.setAttribute("loggedInUser", "");
        return "/donations/add";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
        if (userService.authenticate(email, password)) {
            session.setAttribute("loggedInUser", email);
            return "redirect:/index";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login"; // Return to the login page with an error message
        }
    }


    @GetMapping("/register")
    public String getRegisterView() {
        return "register";
    }


//    Potrzebne tylko przy włączonej obsłudze CSRF w SecurityConfig
//    Wtedy login może być realizowany tylko z wykorzystaniem żądań typu POST, a nie GET
//    @GetMapping("/logout")
//    public String getLogoutView() {
//        return "/logout-view";
//    }
}
