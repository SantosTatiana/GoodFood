package pl.coderslab.Logowanie;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.User.User;
import pl.coderslab.User.UserRepository;
import pl.coderslab.User.UserService;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
//
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//    private final BCryptPasswordEncoder passwordEncoder;
//
//    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
//                           BCryptPasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//    }
//
//
//    @Override
//    public User findByUserName(String username) {
//        return userRepository.findByUsername(username);
//    }
//    @Override
//    public void saveUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        user.setEnabled(1);
//        Role userRole = roleRepository.findByName("ROLE_USER");
//        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
//        userRepository.save(user);
//    }

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
                           BCryptPasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    @Override
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(1);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}