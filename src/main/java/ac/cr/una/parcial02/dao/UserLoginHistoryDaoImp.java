package ac.cr.una.parcial02.dao;

import ac.cr.una.parcial02.model.User;
import ac.cr.una.parcial02.model.UserLoginHistory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UserLoginHistoryDaoImp implements UserLoginHistoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserLoginHistory add(UserLoginHistory userLoginHistory) {
        sessionFactory.getCurrentSession().save(userLoginHistory);
        return userLoginHistory;
    }

    @Override
    public List<UserLoginHistory> listUserLoginHistory() {
        @SuppressWarnings("unchecked")
        TypedQuery<UserLoginHistory> query=sessionFactory.getCurrentSession().createQuery("from UserLoginHistory");
        return query.getResultList();
    }

    @Override
    public List<UserLoginHistory> listUserLoginHistoryById(Long id) {
        // Create CriteriaBuilder
        CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();

        // Create CriteriaQuery
        CriteriaQuery<UserLoginHistory> query = builder.createQuery(UserLoginHistory.class);
        Root<UserLoginHistory> root = query.from(UserLoginHistory.class);
        Join<UserLoginHistory, User> joinTable = root.join("user");
        query.select(root);
        query.where(builder.equal(joinTable.get("id"), id));

        List<UserLoginHistory> listUserLoginHistory = sessionFactory.getCurrentSession().createQuery(query).getResultList();

        return listUserLoginHistory;
    }
}
