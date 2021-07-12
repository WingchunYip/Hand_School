package com.hand.mybatis.demo;

/**
 * @author WingchunYip
 * @date 2021/7/12 20:11
 * @email YINGJIN.YE@hand-china.com
 */
import com.hand.mybatis.demo.Entity.User;
import com.hand.mybatis.demo.Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserMapperTest {

    private SqlSession sqlSession;

    private UserMapper userMapper;

    //该注解用于执行以下 TEST注解方法执行前 初始化
    @Before
    public void init() throws IOException {
//        通过相对路径，加载配置文件
        String resource = "MybatisConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
//        初始化工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        获取sql session
        sqlSession = sqlSessionFactory.openSession();
//        获取对应的接口实现对象
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void findUserById() {
//        执行查询方法
        User user = userMapper.findUserById(1L);
        System.out.println(user.toString());
    }

    @Test
    public void findUserByName() {
//        执行查询方法
        List<User> users = userMapper.findUserByName("li");
        System.out.println(users.size());
    }

    @Test
    public void addUser() {
//        新增一个用户
        User user = new User();
        user.setUserName("guijiaoqi");
        user.setName("鬼脚七");
        user.setBirthday(new Date());
        user.setAge(1);

        userMapper.addUser(user);
        System.out.println(user.toString());
        sqlSession.commit();
        System.out.println(user.toString());
    }

    @Test
    public void updateById() {
//        更新数据
        User user = new User();
        user.setId(3L);
        user.setUserName("longqi");
        user.setName("龙七");
        user.setBirthday(new Date());
        userMapper.updateById(user);
        sqlSession.commit();
    }

    @Test
    public void deleteById() {
//        删除一条数据
        userMapper.deleteById(1);
        sqlSession.commit();
    }

    //用于 TEST注解 方法执行后 关闭资源
    @After
    public void destroy() {
        sqlSession.close();
    }
}
