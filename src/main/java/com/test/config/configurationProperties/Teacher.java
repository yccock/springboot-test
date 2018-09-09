package com.test.config.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将属性文件中的值映射到这个组件中
 * ConfigurationProperties默认从全局配置文件application.properties工application.yml中获取
 * prefix = "teacher" 将配置文件中的哪个属性进行映射
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
