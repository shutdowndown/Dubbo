package edu.cn.controller;

import edu.cn.User;
import edu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{Id}")
    @ResponseBody
    private User getUserById(@PathVariable String Id){
        User user = userService.findUserByName(Id);
        return user;
    }

}
