import com.twitter.internal.android.service.x;
import com.twitter.library.service.aa;
import com.twitter.library.client.az;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.av;
import com.twitter.library.client.as;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.featureswitch.d;
import java.util.HashMap;
import android.net.Uri;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import com.twitter.library.client.au;

// 
// Decompiled by Procyon v0.5.30
// 

class uq implements au, uj
{
    private static AtomicInteger a;
    private final Context b;
    private final Uri c;
    private final uk d;
    private final HashMap e;
    
    static {
        uq.a = new AtomicInteger(1);
    }
    
    public uq(final Context context, final uk uk) {
        this(context, uk, com.twitter.library.featureswitch.d.g("card_registry_capi_endpoint_url"));
    }
    
    public uq(final Context context, final uk d, final Uri c) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = new HashMap();
    }
    
    public uq(final Context context, final uk uk, final String s) {
        this(context, uk, Uri.parse(s));
    }
    
    private int a(final long n, final String s, final ul ul, final HttpOperation$RequestMethod httpOperation$RequestMethod) {
        final int incrementAndGet = uq.a.incrementAndGet();
        final ur ur = new ur(this.b, n, ul, uw.a(Uri.parse(s), this.c), httpOperation$RequestMethod);
        this.e.put(incrementAndGet, ur);
        as.a(this.b).a(ur, new av(incrementAndGet, this));
        return incrementAndGet;
    }
    
    private void a(final y y) {
        if (y != null) {
            y.cancel(false);
        }
    }
    
    @Override
    public int a(final long n, final String s, final ul ul) {
        synchronized (this) {
            return this.a(n, s, ul, HttpOperation$RequestMethod.b);
        }
    }
    
    @Override
    public void a() {
        synchronized (this) {
            final Iterator<Map.Entry<K, y>> iterator = this.e.entrySet().iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next().getValue());
            }
        }
        this.e.clear();
    }
    // monitorexit(this)
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    // monitorenter(this)
    // monitorexit(this)
    
    @Override
    public void a(final int n, final y y) {
    Label_0078_Outer:
        while (true) {
            while (true) {
            Label_0130:
                while (true) {
                    Label_0124: {
                        synchronized (this) {
                            this.e.remove(n);
                            if (y.P().a(az.a(this.b).b())) {
                                final x l = y.l();
                                if (l == null) {
                                    break Label_0124;
                                }
                                final aa aa = (aa)l.b();
                                if (aa == null) {
                                    break Label_0130;
                                }
                                final int a = aa.a() ? 1 : 0;
                                final ur ur = (ur)y;
                                if (a != 0 && ur.a != null) {
                                    this.d.a(ur.e, ur.a);
                                }
                            }
                            return;
                        }
                    }
                    final aa aa = null;
                    continue Label_0078_Outer;
                }
                final int a = 0;
                continue;
            }
        }
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    // monitorenter(this)
    // monitorexit(this)
}
