import com.jie.config.Config;
import com.jie.pojo.Cat;
import com.jie.pojo.Dog;
import com.jie.pojo.person;
import com.jie.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-08 22:49
 **/

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog);
    }
    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Dog dog = context.getBean("dog", Dog.class);
        dog.shout();
        System.out.println(dog.getName());
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println(cat.toString());
        person person = context.getBean("person", person.class);
        System.out.println(person.getCat().toString());
    }
}
