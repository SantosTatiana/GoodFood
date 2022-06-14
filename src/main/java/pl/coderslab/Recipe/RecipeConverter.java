package pl.coderslab.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class RecipeConverter implements Converter<String, Recipe> {

    @Autowired
    private RecipeDao recipeDao;

    @Override
    public Recipe convert(String source){
        return recipeDao.findById(Long.parseLong(source));
    }

}
