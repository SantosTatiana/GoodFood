package pl.coderslab.Logowanie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.User.User;
import pl.coderslab.User.UserDao;
import pl.coderslab.User.UserService;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

//    @RequestMapping(value = {"/login/user"}, method = RequestMethod.GET)
//    public String login() {
//        return "admin/login";
//    }

    private final UserDao userDao;
    private final UserService userService;

    public LoginController(UserDao userDao, UserService userService) {
        this.userDao = userDao;
        this.userService = userService;
    }

    @GetMapping("/user")
    public String login() {
        return "admin/login";
    }

//    @RequestMapping(value = {"/login/user"}, method = RequestMethod.GET)
//    public String login1() {
//        return "admin/login";
//    }

//    @PostMapping("/user")
//    public String login1(){
//        return "/app/app";
//    }


    @GetMapping("/admin")
    @ResponseBody
    public String userInfo(@AuthenticationPrincipal UserDetails customUser) {
        return "You are logged as " + customUser.getAuthorities();
    }

}
