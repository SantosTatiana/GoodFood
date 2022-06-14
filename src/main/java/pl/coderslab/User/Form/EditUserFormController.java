package pl.coderslab.User.Form;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.User.User;
import pl.coderslab.User.UserDao;
import pl.coderslab.User.UserRepository;

@Slf4j
@Controller
@RequestMapping("/app/edit")
public class EditUserFormController {

    private UserDao userDao;
    private final UserRepository userRepository;


    public EditUserFormController(UserDao userDao, UserRepository userRepository) {
        this.userDao = userDao;
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public String editPassword(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "app/edytujdane";
    }


}
