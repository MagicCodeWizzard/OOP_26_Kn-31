package class_links.model;

import java.util.Date;

import class_links.model.User;

public class Account {
    private long id = 0;
    private boolean is_locked;
    private boolean is_suspended;
    private int reputationLevel;
    private Date lastLoginDate;
    private Date registrationDate;
    private User user = null;

    public Account(User user)
    {
        if (user == null) {
            throw new IllegalArgumentException(
                "Акаунт не може бути без користувача!"
            );
        }

        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", is_locked=" + is_locked +
                ", is_suspended=" + is_suspended +
                ", reputationLevel=" + reputationLevel +
                ", lastLoginDate=" + lastLoginDate +
                ", registrationDate=" + registrationDate +
                ", user=" + user +
                '}';
    }
}
