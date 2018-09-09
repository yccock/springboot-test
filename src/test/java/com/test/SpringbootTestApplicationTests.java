package com.test;

import com.test.config.configurationProperties.Teacher;
import com.test.config.propertySource.TeacherProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestApplicationTests {

	@Autowired
	Teacher teacher;

    @Autowired
    TeacherProperty teacherProperty;

    @Autowired
    ApplicationContext applicationContext;

	@Test
	public void testConfigurationProperties() {
		System.out.println(teacher);
	}

    @Test
    public void testPropertySource() {
        System.out.println(teacherProperty);
    }

    @Test
    public void testHelloService() {
        boolean helloService = applicationContext.containsBean("helloService");
        System.out.println(helloService);
    }

    @Test
    public void testHelloService02() {
        boolean helloService02 = applicationContext.containsBean("helloService02");
        System.out.println(helloService02);

    }


}
