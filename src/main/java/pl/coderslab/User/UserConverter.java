package pl.coderslab.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class UserConverter implements Converter <String, User> {

    @Autowired
    private UserDao userDao;

    @Override
    public User convert (String source){
        return userDao.findById(Long.parseLong(source));
    }


}
