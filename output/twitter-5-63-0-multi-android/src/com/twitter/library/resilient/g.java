// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.resilient;

import com.twitter.library.service.y;
import android.os.Bundle;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.Session;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import com.twitter.internal.android.service.c;

public class g implements c
{
    private static g a;
    private final Context b;
    private final d c;
    private Map d;
    private Map e;
    
    protected g(final Context b) {
        this.b = b;
        this.c = com.twitter.library.resilient.d.a(b);
        this.d = new HashMap();
        this.e = new HashMap();
    }
    
    public static g a(final Context context) {
        synchronized (g.class) {
            if (g.a == null) {
                g.a = new g(context.getApplicationContext());
            }
            return g.a;
        }
    }
    
    protected a a(final Session session, final com.twitter.library.resilient.c c) {
        final b b = this.d.get(c.b);
        if (b == null) {
            throw new UnsupportedOperationException("No job builder registered for type: " + c.b);
        }
        try {
            return b.b(this.b, session, c);
        }
        catch (JSONException ex) {
            this.c.a(this.b, c);
            ErrorReporter.a((Throwable)ex);
            return null;
        }
    }
    
    public com.twitter.library.resilient.c a(final a a, final int n, final long n2) {
        final b b = this.e.get(a.getClass());
        if (b == null) {
            throw new UnsupportedOperationException(a.getClass() + " must first be registered as persistent job.");
        }
        final String string = UUID.randomUUID().toString();
        try {
            return new com.twitter.library.resilient.c(string, b.b, n, n2, System.currentTimeMillis(), 0L, null);
        }
        catch (JSONException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    public void a() {
        final List c = this.c.c();
        final HashMap<Object, List<com.twitter.library.resilient.c>> hashMap = (HashMap<Object, List<com.twitter.library.resilient.c>>)new HashMap<Object, Object>();
        for (final com.twitter.library.resilient.c c2 : c) {
            List<com.twitter.library.resilient.c> list = hashMap.get(c2.d);
            if (list == null) {
                list = new ArrayList<com.twitter.library.resilient.c>(5);
                hashMap.put(c2.d, list);
            }
            list.add(c2);
        }
        final az a = az.a(this.b);
        for (final Map.Entry<Long, List<com.twitter.library.resilient.c>> entry : hashMap.entrySet()) {
            final long longValue = entry.getKey();
            final Session b = a.b(longValue);
            String s;
            if (b != null) {
                final Iterator<com.twitter.library.resilient.c> iterator3 = entry.getValue().iterator();
                while (iterator3.hasNext()) {
                    final a a2 = this.a(b, iterator3.next());
                    if (a2 != null) {
                        if (a2.g()) {
                            this.a(a2);
                        }
                        else {
                            a2.b(this.b);
                        }
                    }
                }
                s = "success";
            }
            else {
                s = "failure";
            }
            ScribeService.a(this.b, new TwitterScribeLog(longValue).b(new String[] { "app:twitter_service:persistent_jobs:login", s }));
        }
    }
    
    public void a(final Bundle bundle, final y y) {
    }
    
    public void a(final b b) {
        synchronized (this) {
            final b b2 = this.d.get(b.b);
            if (b2 != null && b2.a != b.a) {
                throw new RuntimeException(String.format("Persistent job type %s can not be registered at key %s since it is already registered to %s", b.a.getName(), b.b, b2.toString()));
            }
        }
        this.d.put(b.b, b);
        this.e.put(b.a, b);
    }
    // monitorexit(this)
    
    public void a(final y y) {
        if (y instanceof a) {
            this.c.a(this.b, (a)y);
        }
    }
    
    protected boolean a(final a a) {
        final boolean a2 = this.c.a(this.b, a.e());
        if (a2) {
            a.a(this.b);
        }
        return a2;
    }
    
    public void b(final y y) {
        if (y instanceof a) {
            this.c.a(this.b, ((a)y).e());
        }
    }
}
