package source.service;

import source.entity.User;

public interface UserService {

    void save (User user);

    User findByEmail (String email);

    void update (User user);

    User findById(int id);
}
