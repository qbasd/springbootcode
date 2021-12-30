/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-09 15:42
 **/
public class Test {
    @org.junit.Test
    public void test1(){
        UserDaoImp target = new UserDaoImp();
        System.out.println(target.getClass());//输出目标对象信息
        UserDao proxy = (UserDao) new UserProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
