import com.htt.dubbo.service.HelloDubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * The type Main.
 */
public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext
                ("classpath:applicationContext.xml");
        /**
         * 引用随机版本
         */
        HelloDubboService helloDubbo = (HelloDubboService) classPathXmlApplicationContext.getBean("helloDubbo");
        String linux = helloDubbo.sayHello("dubbo");

        System.out.println(linux);

        HelloDubboService helloDubbo1 = (HelloDubboService) classPathXmlApplicationContext.getBean
                ("helloDubboService");
        String linux1 = helloDubbo1.sayHello("dubbo");

        System.out.println(linux1);

        HelloDubboService helloDubbo2 = (HelloDubboService) classPathXmlApplicationContext.getBean
                ("helloDubboService1");
        String linux2 = helloDubbo2.sayHello("dubbo");

        System.out.println(linux2);
    }
}
