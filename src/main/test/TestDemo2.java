import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zhang.spring.dao.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test/applicationContext.xml")
public class TestDemo2 {

    @Test
    public void getUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-test/applicationContext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

}
