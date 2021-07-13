package HandSchool.MybatisDemo1.entity;

import java.util.Date;

/**
 * @author WingchunYip
 * @date 2021/7/12 18:20
 * @email YINGJIN.YE@hand-china.com
 */
public class User {

    private Long id;
    private String userName;
    private String name;
    private Date birthday;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }
}
