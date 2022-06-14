//package pl.coderslab.User.Form;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import pl.coderslab.User.User;
//import pl.coderslab.User.UserDao;
//import pl.coderslab.User.UserRepository;
//
//import javax.validation.Valid;
//import java.util.Optional;
//
//@Slf4j
//@Controller
//@RequestMapping("/registration")
//@SessionAttributes({"user"})
//public class UserFormController {
//
//    private final UserDao userDao;
//
//    private final UserRepository userRepository;
//
//    public UserFormController(UserDao userDao, UserRepository userRepository) {
//        this.userDao = userDao;
//        this.userRepository = userRepository;
//    }
//
//    @GetMapping("/user")
//    public String add(Model model) {
//        User user = new User();
//        model.addAttribute("user", user);
//        return "user/add";
//    }
//


//    @PostMapping("/user")
//    public String save(@Valid User user, BindingResult result, Model model) {
//       if (user.getPassword().equals(user.getRepassword())) {
//            userRepository.save(user);
//            return "app/app";
//
//        } else return "user/add";
//
//    }

//2
//    @PostMapping("/user")
//    public String save(User user, UserRepository userRepository) {
//        Optional<User> userOptional = userRepository.findUserByMail(user.getMail());
//        if (userOptional.isPresent() && user.getPassword().equals(user.getRepassword())) {
//            userRepository.save(user);
//            return "app/app";
//
//        } else return "user/add";
//    }



//}



