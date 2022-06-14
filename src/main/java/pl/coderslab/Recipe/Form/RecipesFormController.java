package pl.coderslab.Recipe.Form;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.Recipe.Recipe;
import pl.coderslab.Recipe.RecipeDao;
import pl.coderslab.Recipe.RecipeRepository;
import pl.coderslab.User.UserDao;

import java.util.Collection;

@Slf4j
@Controller
@RequestMapping("/app")
public class RecipesFormController {

    private final RecipeDao recipeDao;
    private final RecipeRepository recipeRepository;
    private final UserDao userDao;

    public RecipesFormController(RecipeDao recipeDao, RecipeRepository recipeRepository, UserDao userDao) {
        this.recipeDao = recipeDao;
        this.recipeRepository = recipeRepository;
        this.userDao = userDao;
    }

    @ModelAttribute("recipes")
    public Collection<Recipe> recipes() {
        return this.recipeDao.getList();
    }

    @GetMapping("/recipes")
    public String list(Model model) {
        model.addAttribute("recipe", recipeDao.getList());
        return "app/przepisy";
    }


    //szczegóły
     @GetMapping("/recipes/{id}")
    public String details(Model model,@PathVariable Long id) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipeRepository.findAllById(id));
        return "app/szczegóły";
    }

//    @GetMapping("/recipes/{id}")
//    public String details(@PathVariable long id) {
//        recipeRepository.findById(id);
//        return "app/szczegóły";
//    }


//    @GetMapping("/recipes/{id}")
//    public String details(Model model, @PathVariable long id) {
//        Recipe recipe = recipeRepository.getOne(id);
//        model.addAttribute("recipe", recipeRepository.getOne());
//        return "app/szczegóły";
//    }

}

