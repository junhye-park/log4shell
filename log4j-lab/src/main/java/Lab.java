import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lab {
    static {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
    }
    private static final Logger logger = LogManager.getLogger(Lab.class);

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("입력값이 없습니다.");
            return;
        }
        logger.error(args[0]);
    }
}

