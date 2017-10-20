package ac.cr.una.parcial02.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "UserLoginHistory")
public class UserLoginHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "dateTime")
    private Date dateTime;

    public UserLoginHistory() {
    }

    public UserLoginHistory(User user, Date dateTime) {
        this.user = user;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
