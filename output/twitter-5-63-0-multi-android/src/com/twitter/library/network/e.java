// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.account.k;
import android.text.TextUtils;
import com.twitter.library.service.aa;
import com.twitter.library.api.account.l;
import com.twitter.library.service.ab;
import android.content.Context;

public class e extends a
{
    private String a;
    private String b;
    
    private e(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static a a(final Context context, final ab ab) {
        synchronized (e.class) {
            a a;
            if (ab.b) {
                a = new t(ab.d);
            }
            else {
                a = a(context);
            }
            return a;
        }
    }
    
    public static e a(final Context context) {
        // monitorenter(e.class)
        String s = null;
        int n = 0;
        String s2 = null;
        while (true) {
            final int n2;
            String s3 = null;
            String f = null;
            Label_0093: {
                if (s2 != null) {
                    break Label_0093;
                }
                n2 = n + 1;
                if (n >= 2) {
                    break Label_0093;
                }
                try {
                    s3 = e(context);
                    Label_0058: {
                        if (s3 == null) {
                            s3 = g(context);
                            final e e = null;
                            if (s3 != null) {
                                break Label_0058;
                            }
                            Label_0052: {
                                return e;
                            }
                        }
                    }
                    f = f(context);
                    if (f == null) {
                        final String c = c(context, s3);
                        n = n2;
                        final String s4 = s3;
                        s2 = c;
                        s = s4;
                        continue;
                    }
                    break Label_0093;
                    e e = null;
                    // iftrue(Label_0052:, s2 == null)
                    e = new e(s, s2);
                    return e;
                }
                finally {
                }
                // monitorexit(e.class)
            }
            n = n2;
            final String s5 = s3;
            s2 = f;
            s = s5;
        }
    }
    
    private static void a(final Context context, final String s) {
        context.getSharedPreferences("guest_auth", 0).edit().putString("access_token", s).apply();
    }
    
    public static void b(final Context context) {
        d(context);
    }
    
    private static void b(final Context context, final String s) {
        context.getSharedPreferences("guest_auth", 0).edit().putString("guest_token", s).apply();
    }
    
    private static String c(final Context context, final String s) {
        final l l = new l(context, s);
        l.j("Token requests are always considered polling.");
        final aa s2 = l.S();
        final int a = s2.f().a;
        if (s2.a()) {
            final String a2 = l.a();
            b(context, a2);
            return a2;
        }
        if (a == 401 || a == 403) {
            c(context);
        }
        return null;
    }
    
    private static void c(final Context context) {
        context.getSharedPreferences("guest_auth", 0).edit().remove("access_token").apply();
    }
    
    private static void d(final Context context) {
        context.getSharedPreferences("guest_auth", 0).edit().remove("guest_token").apply();
    }
    
    private static String e(final Context context) {
        final String string = context.getSharedPreferences("guest_auth", 0).getString("access_token", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        return null;
    }
    
    private static String f(final Context context) {
        final String string = context.getSharedPreferences("guest_auth", 0).getString("guest_token", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        return null;
    }
    
    private static String g(final Context context) {
        final k k = new k(context);
        k.j("Token requests are always considered polling.");
        if (k.S().a()) {
            final String a = k.a();
            a(context, a);
            return a;
        }
        return null;
    }
    
    @Override
    public void a(final HttpOperation httpOperation, final long n) {
        if (!TextUtils.isEmpty((CharSequence)this.a) && !TextUtils.isEmpty((CharSequence)this.b)) {
            httpOperation.a("Authorization", "Bearer " + this.a);
            httpOperation.a("X-Guest-Token", this.b);
        }
    }
    
    public String b() {
        return this.b;
    }
}
