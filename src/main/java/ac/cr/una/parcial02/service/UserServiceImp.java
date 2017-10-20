package ac.cr.una.parcial02.service;


import ac.cr.una.parcial02.dao.RoleDao;
import ac.cr.una.parcial02.dao.UserDao;
import ac.cr.una.parcial02.model.Role;
import ac.cr.una.parcial02.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Transactional
    @Override
    public User add(User user) {
        User userPersisted = userDao.add(user);
        return userPersisted;
    }

    @Transactional
    @Override
    public User update(Long idUser, User user) {
        User userPersisted = userDao.update(idUser, user);

        return userPersisted;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById (Long idUser) {
        return userDao.getUserById(idUser);
    }

    @Transactional
    @Override
    public boolean deleteById (Long idUser) {
        return userDao.deleteById(idUser);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Role> listRoles() { return roleDao.listRoles(); }

    @Transactional(readOnly = false)
    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }
}