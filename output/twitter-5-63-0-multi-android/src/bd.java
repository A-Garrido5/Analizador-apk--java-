import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import com.squareup.okhttp.Protocol;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.5.30
// 

class bd extends ba
{
    private final Method a;
    private final Method b;
    private final Class c;
    private final Class d;
    
    public bd(final Method b, final Method a, final Class c, final Class d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a(final SSLSocket sslSocket, final List list) {
        try {
            final ArrayList list2 = new ArrayList<String>(list.size());
            for (int size = list.size(), i = 0; i < size; ++i) {
                list2.add(list.get(i).name.a());
            }
            this.b.invoke(null, sslSocket, Proxy.newProxyInstance(ba.class.getClassLoader(), new Class[] { this.c, this.d }, new be(list2)));
        }
        catch (InvocationTargetException ex) {
            throw new AssertionError((Object)ex);
        }
        catch (IllegalAccessException ex2) {
            throw new AssertionError((Object)ex2);
        }
    }
    
    @Override
    public bk b(final SSLSocket sslSocket) {
        bk a;
        try {
            final be be = (be)Proxy.getInvocationHandler(this.a.invoke(null, sslSocket));
            if (!be.b && be.c == null) {
                Logger.getLogger("com.squareup.okhttp.OkHttpClient").log(Level.INFO, "NPN callback dropped so SPDY is disabled. Is npn-boot on the boot class path?");
                return null;
            }
            if (be.b) {
                a = null;
            }
            else {
                a = bk.a(be.c);
            }
        }
        catch (InvocationTargetException ex) {
            throw new AssertionError();
        }
        catch (IllegalAccessException ex2) {
            throw new AssertionError();
        }
        return a;
    }
}
