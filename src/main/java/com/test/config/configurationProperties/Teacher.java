package com.test.config.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将全局配置文（application.yml或application.properties）的值映射到这个组件中，类似于 @Value
 * @ConfigurationProperties:告诉springboot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix = "teacher" 将配置文件中的哪个属性进行映射
 *
 * @ConfigurationProperties和@Value区别：
 * 1.@ConfigurationProperties支持批量，而@Value只能一个一个指定
 * 2.@ConfigurationProperties支持jsr303数据校验，而@Value不支持
 * 3.对于复杂类型封装（例如map）@ConfigurationProperties支持，而@Value不支持
 */
@Component
@ConfigurationProperties(prefix = "teacher")
@Validated
public class Teacher {

    private String lastName;

    @Max(20)
    private int age;

    private Date birthday;

    private Map<String, Object> maps;

    private List<Object> list;

    private Student student;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", list=" + list +
                ", student=" + student +
                '}';
    }
}
