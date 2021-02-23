package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.StudentConfig;
import se.lexicon.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(StudentConfig.class);
        StudentDao studentDao = applicationContext.getBean("studentDao",StudentDao.class);
    }
}
