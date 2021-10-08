package pctc;

import com.pctc.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author H1PPPY
 * @date 2021/9/30 16:49
 */
public class TestAll {

    private static PersonService personServiceImpl;

    @Before
    public void read() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        personServiceImpl = (PersonService) context.getBean("personService");
    }

    @Test
    public void test01() {
        personServiceImpl.save("熊腾");
    }

    @Test
    public void test02(){
        personServiceImpl.getName(2);
    }


}
