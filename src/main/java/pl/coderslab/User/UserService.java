package pl.coderslab.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.coderslab.Logowanie.Role;

@Service
public interface UserService {

    User findByUserName(String name);
//    User findByUserMail(String mail);
    void saveUser(User user);

//    @Repository
//    public interface RoleRepository extends JpaRepository<Role, Integer> {
//        Role findByName(String name);
//    }


//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public List<User> getUsers() {
//        return userRepository.findAll();
//    }
//
//    public void addNewUser(User user) {
//        Optional<User> userOptional = userRepository
//                .findUserByMail(user.getMail());
//        if (userOptional.isPresent()){
//            throw new IllegalStateException("Ten adres mail'owy jest już zajęty!");
//        }
//        userRepository.save(user);
//    }
//
//    public void deleteUser(Long userId) {
//        boolean exists = userRepository.existsById(userId);
//        if(!exists) {
//            throw new IllegalStateException("Użytkownik o podanym id= " + userId + " nie istnieje!");
//        }
//        userRepository.deleteById(userId);
//    }

//    @Transactional
//    public void updateUser(Long userId,
//                           String name,
//                           String mail) {
//        User user = userRepository.findById(userId)
//                .orElseThrow(() -> new IllegalStateException("Użytkownik o podanym id= " + userId + " nie istnieje!"));
//        if (name != null && name.length() >0 && !Objects.equals(user.getName(), name)) {
//            user.setName(name);
//        }
//        if (mail != null && mail.length() > 0 && !Objects.equals(user.getMail(), mail)) {
//            Optional<User> userOptional = userRepository.findUserByMail(mail);
//            if (userOptional.isPresent()) {
//                throw new IllegalStateException("Ten adres mail'owy jest już zajęty!");
//            }
//            user.setMail(mail);
//        }
//    }
}

