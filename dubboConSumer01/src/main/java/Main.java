import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author: 19644
 * Date: 2018-04-15 015
 * Time: 02:29:02
 * Description:
 */
public class Main
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext
                ("classpath:applicationContext.xml");
        HelloDubboService helloDubbo = (HelloDubboService) classPathXmlApplicationContext.getBean("helloDubbo");
        String linux = helloDubbo.sayHello("linux");

        System.out.println(linux);
    }
}
