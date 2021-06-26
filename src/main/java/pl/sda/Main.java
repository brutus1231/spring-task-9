package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.service.AuthorBo;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        AuthorBo authorBo = context.getBean(AuthorBo.class);
        System.out.println(authorBo.calculateAveragePrice("PESEL"));
    }
}
