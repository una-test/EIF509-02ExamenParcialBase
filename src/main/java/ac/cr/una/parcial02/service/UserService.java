package ac.cr.una.parcial02.service;


import ac.cr.una.parcial02.model.Role;
import ac.cr.una.parcial02.model.User;

import java.util.List;

public interface UserService {
    User add(User user);
    User update(Long idUser, User user);
    List<User> listUsers();
    User getUserById(Long idUser);
    boolean deleteById(Long idUser);
    List<Role> listRoles();
    User getUserByUsername (String username);
}