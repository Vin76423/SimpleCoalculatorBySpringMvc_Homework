package by.tms.services;

import by.tms.dao.UserDao;
import by.tms.entity.User;
import by.tms.services.exceptions.DuplicateUserException;
import by.tms.services.exceptions.NotFoundUserException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(@Qualifier("inmemoryUserDao") UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public void setUser(User user) {
        if (userDao.userIsContainByLogin(user)) {
            throw new DuplicateUserException("This user already exist!");
        }
        userDao.setUser(user);
    }

    @Override
    public User getUserByLogin(User user) {
        if (userDao.userIsContainByLogin(user)) {
            return userDao.getUserByLogin(user);
        }
        throw new NotFoundUserException();
    }

    @Override
    public boolean userIsContainByLogin(User user) {
        return userDao.userIsContainByLogin(user);
    }
}
