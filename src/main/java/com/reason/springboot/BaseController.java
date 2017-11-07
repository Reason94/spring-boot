package com.reason.springboot;

import com.reason.springboot.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by L8104 on 2017/11/7.
 */
@RestController
@RequestMapping(value = "/springboot")
public class BaseController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public User test(@Valid User user){
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        return user;
    }
}
