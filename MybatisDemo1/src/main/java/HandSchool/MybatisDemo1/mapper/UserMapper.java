package HandSchool.MybatisDemo1.mapper;

import org.apache.ibatis.annotations.Mapper;

import HandSchool.MybatisDemo1.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author WingchunYip
 * @date 2021/7/12 19:25
 * @email YINGJIN.YE@hand-china.com
 */
@Mapper
@Component
public interface UserMapper {

    User findUserById(long id);


}
