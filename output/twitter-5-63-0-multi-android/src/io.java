import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.30
// 

public class io
{
    private static final Object a;
    private static iq b;
    private static ArrayList c;
    
    static {
        a = new Object();
        io.b = new iq(100, 100, 10000, 600000, 3600000, 86400000);
        io.c = new ArrayList();
    }
    
    public static iq a() {
        synchronized (io.a) {
            return io.b;
        }
    }
    
    public static void a(final ip ip) {
        synchronized (io.c) {
            io.c.add(new WeakReference<ip>(ip));
        }
    }
    
    public static void a(final iq b) {
        while (true) {
            while (true) {
                ip ip = null;
                synchronized (io.a) {
                    if (io.b.equals(b)) {
                        return;
                    }
                    io.b = b;
                    // monitorexit(io.a)
                    synchronized (io.c) {
                        final Iterator<WeakReference<ip>> iterator = (Iterator<WeakReference<ip>>)io.c.iterator();
                        while (iterator.hasNext()) {
                            ip = iterator.next().get();
                            if (ip != null) {
                                break;
                            }
                            iterator.remove();
                        }
                    }
                }
                ip.au_();
                continue;
            }
        }
    }
    // monitorexit(list)
}
