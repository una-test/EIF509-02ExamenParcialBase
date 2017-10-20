package ac.cr.una.parcial02.dao;

import ac.cr.una.parcial02.model.User;

import java.util.List;

public interface UserDao {
    User add(User user);
    User update (Long idUser, User user);
    List<User> listUsers();
    User getUserById (Long idUser);
    boolean deleteById (Long idUser);
    User getUserByEmail (String email);
    User getUserByUsername (String username);
}
