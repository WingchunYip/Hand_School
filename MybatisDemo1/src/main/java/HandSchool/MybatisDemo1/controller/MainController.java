package HandSchool.MybatisDemo1.controller;

import HandSchool.MybatisDemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WingchunYip
 * @date 2021/7/12 18:33
 * @email YINGJIN.YE@hand-china.com
 */


@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/byid")
    public Object test1(){

//        return userService.test1();
        return 1;
    }

}
