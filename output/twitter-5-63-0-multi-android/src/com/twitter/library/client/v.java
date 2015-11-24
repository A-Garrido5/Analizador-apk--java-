// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.service.z;
import com.twitter.library.service.y;
import android.text.TextUtils;
import com.twitter.library.api.b;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bk;
import android.content.Context;

public class v
{
    private static v a;
    private final Context b;
    private final az c;
    
    private v(final Context b) {
        this.b = b;
        this.c = az.a(b);
    }
    
    public static v a(final Context context) {
        synchronized (v.class) {
            if (v.a == null) {
                v.a = new v(context.getApplicationContext());
            }
            return v.a;
        }
    }
    
    private void c(final String s) {
        if (bk.c(new k(this.b, s).getLong("app_graph_timestamp", 0L))) {
            return;
        }
        new w(this).execute((Object[])new Void[0]);
    }
    
    public void a() {
        final Session b = az.a(this.b).b();
        final k k = new k(this.b, b.e());
        final boolean contains = k.contains("app_graph_status");
        final String string = k.getString("app_graph_status", "undetermined");
        final b a = u.a.a();
        if (b.d() && d.f("app_graph_enabled") && (!contains || ("optin".equals(string) && !bk.c(k.getLong("app_graph_timestamp", 0L)))) && (a == null || !a.b())) {
            this.a((String)null);
        }
    }
    
    public void a(final String s) {
        final Session b = this.c.b();
        if (TextUtils.isEmpty((CharSequence)s)) {
            as.a(this.b).a(new ov(this.b, b), new x(this, null));
            return;
        }
        as.a(this.b).a(new ow(this.b, b, s), new x(this, null));
    }
    
    public void b(String s) {
        final m a = new k(this.b, this.c.b().e()).a();
        if (TextUtils.isEmpty((CharSequence)s)) {
            s = "undetermined";
        }
        a.a("app_graph_status", s).apply();
    }
}
