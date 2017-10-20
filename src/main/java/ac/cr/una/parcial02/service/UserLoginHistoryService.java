package ac.cr.una.parcial02.service;

import ac.cr.una.parcial02.model.UserLoginHistory;

import java.util.List;

public interface UserLoginHistoryService {
    UserLoginHistory add(UserLoginHistory userLoginHistory);
    List<UserLoginHistory> listUserLoginHistory();
    int getTotalCountById(Long id);
    boolean analyzeLoginUsers();
}
