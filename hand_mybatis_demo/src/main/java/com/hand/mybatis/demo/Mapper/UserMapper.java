package com.hand.mybatis.demo.Mapper;

/**
 * @author WingchunYip
 * @date 2021/7/12 20:10
 * @email YINGJIN.YE@hand-china.com
 */

import com.hand.mybatis.demo.Entity.User;

import java.util.List;

public interface UserMapper {

    User findUserById(Long id);

    List<User> findUserByName(String userName);

    void addUser(User user);

    void updateById(User user);

    void deleteById(Integer id);
}
