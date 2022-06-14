package pl.coderslab.Recipe.Form;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.Recipe.RecipeDao;
import pl.coderslab.Recipe.RecipeRepository;
import pl.coderslab.User.UserDao;

@Slf4j
@Controller
@RequestMapping("/app/recipes")
public class RecipesDetailsFormController {
    private final RecipeDao recipeDao;
    private final RecipeRepository recipeRepository;
    private final UserDao userDao;

    public RecipesDetailsFormController(RecipeDao recipeDao, RecipeRepository recipeRepository, UserDao userDao) {
        this.recipeDao = recipeDao;
        this.recipeRepository = recipeRepository;
        this.userDao = userDao;
    }


//    @GetMapping("/details")
//    public String details(Model model) {
//        model.addAttribute("recipe", recipeDao.getList());
//        return "app/szczegóły";
//    }

}
