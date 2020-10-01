package by.tms.dao;

import by.tms.entity.User;

public interface UserDao {
    void setUser(User user);
    User getUserByLogin(User user);
    boolean userIsContainByLogin(User user);
}
