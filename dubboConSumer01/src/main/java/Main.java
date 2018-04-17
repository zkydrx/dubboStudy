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


        HelloDubboService dubboGroup1 = (HelloDubboService) classPathXmlApplicationContext.getBean("dubboGroup1");
        HelloDubboService dubboGroup2 = (HelloDubboService) classPathXmlApplicationContext.getBean("dubboGroup2");
        HelloDubboService dubboGroupRandom = (HelloDubboService) classPathXmlApplicationContext.getBean
                ("dubboRandom");

        String dubboGroup11 = dubboGroup1.sayHello("dubboGroup1");

        System.out.println(dubboGroup11);

        String dubboGroup21 = dubboGroup2.sayHello("dubboGroup2");

        System.out.println(dubboGroup21);
        String dubboRandom = dubboGroupRandom.sayHello("dubboRandom");


        System.out.println(dubboRandom);

    }
}
