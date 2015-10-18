// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.internal.network.l;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import com.twitter.library.client.as;
import java.util.Set;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.service.z;

public class t extends z
{
    private final Context a;
    private final j b;
    private final az c;
    private final u d;
    private final com.twitter.library.av.c e;
    private final Set f;
    
    t(final Context context, final j b, final az c, final u d, final com.twitter.library.av.c e, final Set f) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public t(final Context context, final u u, final com.twitter.library.av.c c) {
        this(context, new j(as.a(context)), az.a(context), u, c, new HashSet());
    }
    
    private a a(final List list, final long n) {
        for (final a a : list) {
            if (a.a == n) {
                return a;
            }
        }
        return null;
    }
    
    protected static String c(final y y) {
        final x l = y.l();
        aa aa;
        if (l != null) {
            aa = (aa)l.b();
        }
        else {
            aa = null;
        }
        l f;
        if (aa != null) {
            f = aa.f();
        }
        else {
            f = null;
        }
        if (f != null) {
            return String.format("Network error. status code: %d", f.a);
        }
        return "";
    }
    
    private void d(final y y) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(az.a(this.a).b().g()).b(new String[] { ":::dynamic_video_ads:dynamic_preroll_request_error" });
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.L = c(y);
        twitterScribeLog.a(twitterScribeItem);
        this.e.a(this.a, twitterScribeLog);
    }
    
    private void e(final y y) {
        if (y instanceof md) {
            final md md = (md)y;
            final List e = md.e();
            for (final Map.Entry<Long, V> entry : md.b().entrySet()) {
                if (entry.getValue() != null) {
                    this.d.a(entry.getKey(), this.a(e, entry.getKey()), (mc)entry.getValue());
                }
            }
        }
    }
    
    private void f(final y y) {
        if (y instanceof md) {
            final List e = ((md)y).e();
            if (e != null) {
                for (final a a : e) {
                    if (a != null) {
                        this.f.remove(a.a);
                    }
                }
            }
        }
    }
    
    public List a() {
        return this.b.a();
    }
    
    @Override
    public void a(final y y) {
        super.a(y);
        this.f(y);
        if (!y.X()) {
            this.d(y);
            return;
        }
        this.e(y);
    }
    
    public void a(final List list) {
        final me me = new me(this.a, this.c.b());
        for (final a a : new ArrayList<a>(list)) {
            if (!this.d.a(a) && !this.f.contains(a.a)) {
                me.a(a);
                this.f.add(a.a);
            }
        }
        final Iterator iterator2 = me.a().iterator();
        while (iterator2.hasNext()) {
            this.b.a(iterator2.next(), this);
        }
    }
    
    public boolean a(final long n) {
        return this.f.contains(n);
    }
}
