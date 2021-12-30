import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: spring-study
 * @description: 代理工厂
 * @author: MrXu
 * @create: 2021-11-09 15:35
 **/
public class UserProxyFactory {
    private Object target;//维护一个目标对象（需被代理的对象）

    public UserProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");

                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);

                        System.out.println("提交事务");

                        return returnValue;
                    }
                });
    }

}
