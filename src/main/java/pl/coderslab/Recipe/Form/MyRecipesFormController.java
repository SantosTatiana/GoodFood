package pl.coderslab.Recipe.Form;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.Category.CategoryDao;
import pl.coderslab.Recipe.Recipe;
import pl.coderslab.Recipe.RecipeDao;
import pl.coderslab.Recipe.RecipeRepository;
import pl.coderslab.User.UserDao;
import pl.coderslab.User.UserRepository;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/app")
public class MyRecipesFormController {
    private final RecipeDao recipeDao;
    private final RecipeRepository recipeRepository;
    private final UserDao userDao;
    private final CategoryDao categoryDao;

    private final UserRepository userRepository;


    public MyRecipesFormController(RecipeDao recipeDao, RecipeRepository recipeRepository, UserDao userDao, CategoryDao categoryDao, UserRepository userRepository) {
        this.recipeDao = recipeDao;
        this.recipeRepository = recipeRepository;
        this.userDao = userDao;

        this.categoryDao = categoryDao;
        this.userRepository = userRepository;
    }


    // dodawanie przepisu
    @GetMapping("/myrecipes/add")
    public String add(Model model) {
        Recipe recipe = new Recipe();
        model.addAttribute("category", categoryDao.findAll());
        model.addAttribute("recipe", recipe);
        return "app/dodawanieprzepisu";
    }

//    @PostMapping("/myrecipes/add")
//    public String save(@Valid Recipe recipe, BindingResult result, Model model, Category category) {
//        model.addAttribute("recipe", recipeDao.getList());
//        recipeRepository.save(recipe);
//        return "app/mojeprzepisy";
//    }

    @PostMapping("/myrecipes/add")
    public String save(@Valid Recipe recipe, BindingResult result, Model model) {
        model.addAttribute("recipe", recipeDao.getList());
        recipeRepository.save(recipe);
//        return "app/mojeprzepisy";
        return "redirect:/app/myrecipes";
    }











//do dokonczenia

    @GetMapping("/myrecipes")
    public String list(Model model, @AuthenticationPrincipal UserDetails userDetails) {
//        model.addAttribute("recipe", recipeRepository.findAllByUserId(userRepository.findByUsername(userDetails.getUsername()).getId()));
        model.addAttribute("recipe", recipeDao.getList());
//        System.out.println(userRepository.findByUsername(userDetails.getUsername()).getId());
        return "app/mojeprzepisy";
    }



















    // usuwanie
    @GetMapping("/myrecipes/delete/{id}")
    public String delete(@PathVariable long id) {
        recipeRepository.deleteById(id);
        return "redirect:/app/myrecipes";
    }

//    @GetMapping("/myrecipes/edit/{id}")
//    public String edit(@PathVariable long id,Model model){
//        recipeRepository.findById(id);
//        model.addAttribute("recipe",recipeDao.getList());
//        return "app/edytujprzepis";
//    }

    //edytowanie przepisu
    @GetMapping("/myrecipes/edit/{id}")
    public String edit(Model model, @PathVariable long id) {
        Recipe recipe = recipeRepository.getOne(id);
        model.addAttribute("category", categoryDao.findAll());
        model.addAttribute("recipe", recipe);
        return "app/edytujprzepis";
    }

    @PostMapping("/myrecipes/edit/{id}")
    public String editSave(@Valid Recipe recipe, BindingResult result, Model model) {
        model.addAttribute("recipe", recipeDao.getList());
        recipeRepository.save(recipe);
        return "app/mojeprzepisy";
    }


    //szczegóły
    @GetMapping("myrecipes/details/{id}")
    public String details(Model model, @PathVariable long id) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipeRepository.findAllById(id));
        return "app/szczegóły2";
    }

}
