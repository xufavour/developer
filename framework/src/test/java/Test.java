import com.favour.developer.framework.AppConfig;
import com.favour.developer.framework.aop.MailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: xyy
 * @Date: 2020/8/31
 */
public class Test {


    @org.junit.Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MailService mailService = context.getBean(MailService.class);
        System.out.println(mailService.sendMail());
    }
}
