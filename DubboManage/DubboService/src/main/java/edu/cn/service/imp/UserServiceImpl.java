package edu.cn.service.imp;

import edu.cn.User;
import edu.cn.imp.UserDAO;
import edu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User findUserByName(String id) {
        return null;
    }
}
