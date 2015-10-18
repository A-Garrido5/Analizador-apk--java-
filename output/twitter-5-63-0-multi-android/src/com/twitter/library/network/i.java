// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.library.featureswitch.d;
import java.lang.reflect.InvocationTargetException;
import com.twitter.library.client.App;
import com.twitter.internal.network.h;
import android.content.Context;
import com.twitter.library.featureswitch.n;

public class i implements n
{
    private static i a;
    private final Context b;
    private int c;
    private boolean d;
    private boolean e;
    
    private i(final Context b) {
        this.c = -1;
        this.d = false;
        this.e = false;
        this.b = b;
    }
    
    public static i a(final Context context) {
        synchronized (i.class) {
            if (i.a == null) {
                i.a = new i(context.getApplicationContext());
            }
            return i.a;
        }
    }
    
    private void a(final boolean b) {
        final int c = this.c();
        if (c != this.c || b) {
            switch (this.c = c) {
                default: {
                    g.a(new aa(this.b));
                    break;
                }
                case 2: {
                    g.a(this.d());
                }
                case 1: {
                    g.a(new aa(this.b));
                }
                case 3: {
                    g.a(new ab(this.b));
                }
            }
        }
    }
    
    private int c() {
        if (App.a()) {
            return 2;
        }
        if (this.e) {
            return 3;
        }
        if (this.d) {
            return 1;
        }
        return 0;
    }
    
    private h d() {
        try {
            return (h)Class.forName("com.twitter.library.network.debug.DebugHttpOperationClientFactory").getConstructor(Context.class).newInstance(this.b);
        }
        catch (NoSuchMethodException ex) {}
        catch (ClassNotFoundException ex2) {
            goto Label_0050;
        }
        catch (InstantiationException ex3) {
            goto Label_0050;
        }
        catch (InvocationTargetException ex4) {
            goto Label_0050;
        }
        catch (IllegalAccessException ex5) {
            goto Label_0050;
        }
    }
    
    public void a() {
        this.a(false);
        com.twitter.library.featureswitch.d.a(this);
    }
    
    @Override
    public void a(final long n) {
        int n2 = 3000;
        this.d = com.twitter.library.featureswitch.d.f("android_network_http_url_connection_enabled");
        this.e = com.twitter.library.featureswitch.d.f("spdy_enabled");
        final int d = com.twitter.internal.network.g.d();
        final int e = com.twitter.internal.network.g.e();
        int a = com.twitter.library.featureswitch.d.a("android_network_connect_timeout_ms", d);
        if (a < n2) {
            a = n2;
        }
        final int a2 = com.twitter.library.featureswitch.d.a("android_network_read_timeout_ms", e);
        if (a2 >= n2) {
            n2 = a2;
        }
        boolean b;
        if (a != d || n2 != e) {
            com.twitter.internal.network.g.a(a, n2);
            b = true;
        }
        else {
            b = false;
        }
        final boolean f = com.twitter.library.featureswitch.d.f("set_polling_header_using_visibility_enabled");
        if (g.c() != f) {
            g.b(f);
        }
        this.a(b);
    }
    
    public void b() {
        this.a(true);
    }
}
