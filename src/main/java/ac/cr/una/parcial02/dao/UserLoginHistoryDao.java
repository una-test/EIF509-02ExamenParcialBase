package ac.cr.una.parcial02.dao;

import ac.cr.una.parcial02.model.UserLoginHistory;

import java.util.List;

public interface UserLoginHistoryDao {
    UserLoginHistory add(UserLoginHistory userLoginHistory);
    List<UserLoginHistory> listUserLoginHistory();
    List<UserLoginHistory> listUserLoginHistoryById(Long id);
}