package ac.cr.una.parcial02.service;

import ac.cr.una.parcial02.dao.UserDao;
import ac.cr.una.parcial02.dao.UserLoginHistoryDao;
import ac.cr.una.parcial02.model.User;
import ac.cr.una.parcial02.model.UserLoginHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserLoginHistoryServiceImp implements UserLoginHistoryService {

    static final double MAX_LOGING = 5;

    @Autowired
    private UserLoginHistoryDao userLoginHistoryDao;

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UserLoginHistory add(UserLoginHistory userLoginHistory) {

        //TODO: Desarrollar conforme enunciado del examen

        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserLoginHistory> listUserLoginHistory() {

        //TODO: Desarrollar conforme enunciado del examen

        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public int getTotalCountById(Long id) {

        //TODO: Desarrollar conforme enunciado del examen

        return 0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean analyzeLoginUsers() {

        //TODO: Desarrollar conforme enunciado del examen

        return false;
    }
}
