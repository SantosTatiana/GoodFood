package pl.coderslab.User;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.security.core.GrantedAuthority;
import pl.coderslab.Logowanie.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Set;

@Entity
public class User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    //kolumny w tabelkach
//    private Long id;
//    @NotNull(message = "To pole musi być wypełnione")
//    private String name;
//    @NotNull(message = "To pole musi być wypełnione")
//    private String surname;
//    @NotBlank(message = "To pole musi być wypełnione")
//    @Email
//    //@UniqueElements(message = "Ten mail jest już zajęty")
//    private String mail;
//    @Size(min = 3, message = "hasło musi się składać z co najmniej 3 liczb/liter/znaków")
//    @Size(max = 6, message = "hasło nie powinno być dłuższe niż 6 liczb/liter/znaków")
//    private String password;
//
//    private String repassword;
//
//
//
//    //gettery&settery
//    public String getRepassword() {
//        return repassword;
//    }
//
//    public void setRepassword(String repassword) {
//        this.repassword = repassword;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getMail() {
//        return mail;
//    }
//
//    public void setMail(String mail) {
//        this.mail = mail;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public User(Long id, String name, String surname, String mail, String password, String repassword) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.mail = mail;
//        this.password = password;
//        this.repassword = repassword;
//    }
//
//    public User(String name, String surname, String mail, String password, String repassword) {
//        this.name = name;
//        this.surname = surname;
//        this.mail = mail;
//        this.password = password;
//        this.repassword = repassword;
//    }
//
//    public User() {
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true, length = 60)
    private String username;
    private String password;
    private int enabled;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    //gettery, settery
}

