package source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.DAO.UserDAO;
import source.entity.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public User findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(User user) {
        userDAO.save(user);
}

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }
}
