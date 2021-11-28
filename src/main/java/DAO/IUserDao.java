package DAO;

import JavaBean.User;
import java.util.List;
public interface IUserDao {
    void save(User s);
    void update(User s);
    void delete(Long Id);
    User getOne(Long Id);
    List<User> getAll();

}

