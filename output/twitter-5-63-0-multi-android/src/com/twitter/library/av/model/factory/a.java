// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.factory;

import com.twitter.library.telephony.d;
import java.util.concurrent.ConcurrentHashMap;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.provider.Tweet;
import com.twitter.library.av.w;
import com.twitter.library.av.f;
import com.twitter.library.av.model.b;
import com.twitter.library.av.playback.au;
import java.util.Iterator;
import com.twitter.library.network.g;
import com.twitter.internal.network.j;
import android.net.Uri;
import android.net.Uri$Builder;
import java.util.Map;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build;
import android.os.Build$VERSION;
import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import android.content.Context;

public abstract class a
{
    protected static String a(final Context context, final int n, final String s) {
        return String.format("Twitter-android/%s Android/%d (%s)", c(context), n, s);
    }
    
    protected static String a(final HttpOperation httpOperation) {
        final l l = httpOperation.l();
        String format = null;
        if (l != null) {
            final Exception c = l.c;
            String s;
            if (c != null) {
                s = c.getMessage();
            }
            else {
                s = l.b;
            }
            format = String.format("Network error. status code: %d reason: %s", l.a, s);
        }
        return format;
    }
    
    public static String b(final Context context) {
        return a(context, Build$VERSION.SDK_INT, Build.MODEL);
    }
    
    protected static String c(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return "";
        }
    }
    
    protected Uri$Builder a(final String s, final Map map, final mc mc) {
        final Uri$Builder buildUpon = Uri.parse(s).buildUpon();
        this.a(buildUpon, map, mc);
        return buildUpon;
    }
    
    protected HttpOperation a(final Context context, final Map map, final j j, final String s) {
        final HttpOperation a = new g(context, s).a(j).a();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            a.a(entry.getKey(), (String)entry.getValue());
        }
        return a.c();
    }
    
    public b a(final Context context, final au au) {
        return this.a(context, au, f.a(context));
    }
    
    public b a(final Context context, final au au, final f f) {
        final String c = au.c();
        final j b = this.b(context, au);
        final Map a = this.a(context);
        final Tweet b2 = au.b();
        final boolean a2 = w.a();
        mc b3 = null;
        if (a2) {
            b3 = null;
            if (b2 != null) {
                b3 = f.a(context).b(b2);
            }
        }
        return this.a(au, b, this.a(context, a, b, this.a(context, this.a(c, a, b3).toString(), au.d())), a, b3);
    }
    
    protected abstract b a(final au p0, final j p1, final HttpOperation p2, final Map p3, final mc p4);
    
    protected String a() {
        if (TelephonyUtil.f()) {
            return "phone";
        }
        return "tablet";
    }
    
    protected String a(final Context context, final String s, final Map map) {
        return s;
    }
    
    protected Map a(final Context context) {
        final ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        TelephonyUtil.d(context);
        final d e = TelephonyUtil.e();
        concurrentHashMap.put("User-Agent", b(context));
        concurrentHashMap.put("Twitter-Player", Boolean.toString(true));
        concurrentHashMap.put("X-CDN-DEVICE", this.a());
        concurrentHashMap.put("Network-Type", e.b);
        this.a(context, concurrentHashMap, e);
        return concurrentHashMap;
    }
    
    protected abstract void a(final Context p0, final Map p1, final d p2);
    
    protected abstract void a(final Uri$Builder p0, final Map p1, final mc p2);
    
    protected abstract j b(final Context p0, final au p1);
}
