import com.htt.dubbo.HelloDubboService;
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
        HelloDubboService helloDubbo = (HelloDubboService) classPathXmlApplicationContext.getBean("helloDubbo");
        String linux = helloDubbo.sayHello("linux");

        System.out.println(linux);
    }
}
