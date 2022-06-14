package pl.coderslab.Logowanie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.User.User;
import pl.coderslab.User.UserDao;
import pl.coderslab.User.UserService;

@Slf4j
@Controller
@RequestMapping("/register")
public class RegistrationController {

    private final UserDao userDao;
    private final UserService userService;

    public RegistrationController(UserDao userDao, UserService userService) {
        this.userDao = userDao;
        this.userService = userService;
    }

    @GetMapping("/user")
    public String register() {
        return "admin/register";
    }

    @PostMapping("/user")
    public String performRegister(User user) {
        userService.saveUser(user);
        return "redirect:/login/user";
    }





}
