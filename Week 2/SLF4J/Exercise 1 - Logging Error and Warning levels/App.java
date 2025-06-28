package SLF4J;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);

        logger.info("This is juts a normal log");
        logger.warn("This is a warning log - Level 10 warning");
        logger.error("This is a error log - Level 1 error");
    }
}
