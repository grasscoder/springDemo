import com.springstudy.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Person person = context.getBean("persion", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Person person = context.getBean("persion", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }
}
