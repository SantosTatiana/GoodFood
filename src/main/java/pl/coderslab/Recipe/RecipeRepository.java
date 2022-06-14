package pl.coderslab.Recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Long> {

List<Recipe>findAllById(Long id);

@Query("SELECT r from Recipe r where r.user.id = ?1")
List<Recipe> findAllByUserId (Long id);

}
