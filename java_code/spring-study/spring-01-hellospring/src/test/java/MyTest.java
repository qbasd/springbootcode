import com.jie.pojo.Hello;
import com.jie.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-06 13:11
 **/
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
    }
}
