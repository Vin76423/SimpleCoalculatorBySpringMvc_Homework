package by.tms.services;

import by.tms.dao.UserDao;
import by.tms.entity.User;

public interface UserService {
    void setUser(User user);
    User getUserByLogin(User user);
    boolean userIsContainByLogin(User user);
}
