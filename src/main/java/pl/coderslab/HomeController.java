package pl.coderslab;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.User.UserRepository;

@Controller
public class HomeController {

    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @GetMapping("/")
//    public String home(@AuthenticationPrincipal UserDetails customUser) {
//        userRepository.findByUsername(customUser.getUsername());
//        return "home";
//    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/contact")
    public String info() {
        return "contact";
    }

//    @GetMapping("/login/user")
//    public String login() {
//        return "Xlogin";
//    }



}
