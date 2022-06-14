package pl.coderslab.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.Recipe.Recipe;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT u FROM User u WHERE u.mail = ?1")
//    Optional<User> findUserByMail(String mail);
//
//    @Query("UPDATE User set password = ?1 where id = ?2")
//    Optional<User> updatePassword(String password);

//    //2
//    User findByUsername(String username);

//    User findAllByMail(String mail);
    User findByUsername(String username);


}
