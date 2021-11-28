import DAO.Impl.UserDao;
import JavaBean.User;
import org.junit.*;

import java.util.List;

public class UserDaoTest {
    UserDao udao = new UserDao();

    @Test
    public void testCreateUser1(){
        User user = new User();
        user.setId(1l);
        user.setPassword("12345");
        user.setAge(18);
        user.setSex(true);

        udao.save(user);
    }
    @Test
    public void testCreateUser2(){
        User user = new User();
        user.setId(4l);
        user.setUserName("小红");
        user.setPassword("6554");
        user.setHeight(180.6);

        user.setAge(20);
        user.setSex(true);

        udao.save(user);
    }
    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassword("12345");

        udao.update(user);
    }
    @Test
    public void testDeleteUser(){
        udao.delete(1l);
    }

    @Test
    public void testSelectOne(){
        User u = udao.getOne(2l);
        System.out.println(u.getUserName());
    }
    @Test
    public void testSelectAll(){
        List<User> list=udao.getAll();
        list.forEach(item->System.out.println(item.getUserName()));
    }
    @Test
    public void testLogin(){
        System.out.println(udao.Login("dawda","151658"));
    }




}