// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.util.Iterator;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.config.c;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import com.twitter.config.b;
import java.util.LinkedHashSet;
import java.util.Set;

public class d
{
    static final yv a;
    private static final Set b;
    private static long c;
    private static i d;
    
    static {
        a = new yv("TestFeatureSwitches");
        b = new LinkedHashSet();
    }
    
    public static float a(final String s, final float n) {
        return com.twitter.config.b.a(com.twitter.library.featureswitch.d.c, s, n);
    }
    
    public static int a(final String s, final int n) {
        return com.twitter.config.b.a(com.twitter.library.featureswitch.d.c, s, n);
    }
    
    public static String a(final long n, final String s) {
        return a(n, s, "unassigned").toLowerCase();
    }
    
    public static String a(final long n, final String s, final String s2) {
        return com.twitter.config.b.a(n, s, s2);
    }
    
    public static String a(final String s) {
        return a(com.twitter.library.featureswitch.d.c, s);
    }
    
    public static String a(final String s, final String s2) {
        return com.twitter.config.b.a(com.twitter.library.featureswitch.d.c, s, s2);
    }
    
    public static String a(final String s, final Object... array) {
        return com.twitter.config.b.b(String.format(s, array));
    }
    
    public static ArrayList a(final int n) {
        return d().a(n);
    }
    
    public static ConcurrentHashMap a() {
        return d().a;
    }
    
    public static void a(final long c) {
        synchronized (d.class) {
            com.twitter.config.b.a(com.twitter.library.featureswitch.d.c = c);
            if (com.twitter.library.featureswitch.d.d != null) {
                com.twitter.library.featureswitch.d.d.b(c);
            }
        }
    }
    
    public static void a(final long n, final FeatureSwitchesConfig featureSwitchesConfig) {
        d().a(n, featureSwitchesConfig);
    }
    
    public static void a(final long n, final FeatureSwitchesManifest featureSwitchesManifest, final FeatureSwitchesConfig featureSwitchesConfig) {
        d().a(n, featureSwitchesManifest, featureSwitchesConfig);
    }
    
    public static void a(final Context context) {
        com.twitter.library.featureswitch.d.a.a();
        if (com.twitter.library.featureswitch.d.d == null) {
            a((c)new i(context));
        }
    }
    
    public static void a(final Context context, final long n) {
        if (!f("feature_switches_configs_quality_control_enabled")) {
            return;
        }
        String s;
        if (d().a(n)) {
            s = "downloaded";
        }
        else {
            s = "manifest";
        }
        ScribeService.a(context, new TwitterScribeLog(n).b("fs", "quality_test", "logged_in", "before", "attempt"));
        ScribeService.a(context, new TwitterScribeLog(n).b("fs", "quality_test", "logged_in", s, a("android_quality_control_v2_logged_in_2328")));
        ScribeService.a(context, new TwitterScribeLog(n).b("fs", "quality_test", "embedded", "before", "attempt"));
        ScribeService.a(context, new TwitterScribeLog(n).b("fs", "quality_test", "embedded", s, a("android_quality_control_v2_embedded_2330")));
        ScribeService.a(context, new TwitterScribeLog(n).b("fs", "quality_test", "logged_out", "before", "attempt"));
        ScribeService.a(context, new TwitterScribeLog(n).b("fs", "quality_test", "logged_out", s, a("android_quality_control_v2_logged_out_2329")));
    }
    
    public static void a(final c c) {
        com.twitter.library.featureswitch.d.a.a();
        com.twitter.config.b.a(c);
        if (c instanceof i) {
            a((i)c);
        }
    }
    
    public static void a(final Session session) {
        synchronized (d.class) {
            d().c(session.g());
        }
    }
    
    private static void a(final i d) {
        if (d.d != null) {
            final Iterator<n> iterator = d.b.iterator();
            while (iterator.hasNext()) {
                d.d.b(iterator.next());
            }
        }
        d.d = d;
        if (d.d != null) {
            final Iterator<n> iterator2 = d.b.iterator();
            while (iterator2.hasNext()) {
                d.d.a(iterator2.next());
            }
            if (d.c != 0L) {
                d.d.b(d.c);
            }
        }
    }
    
    public static void a(final n n) {
        com.twitter.library.featureswitch.d.b.add(n);
        if (com.twitter.library.featureswitch.d.d != null) {
            com.twitter.library.featureswitch.d.d.a(n);
        }
    }
    
    public static boolean a(final long n, final String s, final boolean b) {
        return b.a(n, s, b);
    }
    
    public static boolean a(final long n, final String s, final String... array) {
        final String a = a(n, s);
        final int length = array.length;
        int n2 = 0;
        boolean b;
        while (true) {
            b = false;
            if (n2 >= length) {
                break;
            }
            if (a.equalsIgnoreCase(array[n2])) {
                b = true;
                break;
            }
            ++n2;
        }
        return b;
    }
    
    public static boolean a(final String s, final boolean b) {
        return b.a(com.twitter.library.featureswitch.d.c, s, b);
    }
    
    public static boolean a(final String s, final String... array) {
        return a(com.twitter.library.featureswitch.d.c, s, array);
    }
    
    public static String b() {
        return d().a();
    }
    
    public static String b(final String s) {
        return d().a(s).toLowerCase();
    }
    
    public static void b(final long n) {
        if (com.twitter.library.featureswitch.d.d != null) {
            com.twitter.library.featureswitch.d.d.d(n);
        }
    }
    
    public static void b(final long n, final FeatureSwitchesConfig featureSwitchesConfig) {
        a(n, c(), featureSwitchesConfig);
    }
    
    public static void b(final Context context, final long n) {
        d().a(context, n);
    }
    
    public static void b(final n n) {
        if (com.twitter.library.featureswitch.d.d != null) {
            com.twitter.library.featureswitch.d.d.b(n);
        }
        com.twitter.library.featureswitch.d.b.remove(n);
    }
    
    public static FeatureSwitchesManifest c() {
        return d().b();
    }
    
    public static boolean c(final long n) {
        return d().a(n);
    }
    
    public static boolean c(final String s) {
        return !a(s).equalsIgnoreCase("unassigned");
    }
    
    private static i d() {
        if (com.twitter.library.featureswitch.d.d != null) {
            return com.twitter.library.featureswitch.d.d;
        }
        if (!com.twitter.config.b.a()) {
            throw new IllegalStateException("FeatureSwitches.initialize() must be called first.");
        }
        throw new UnsupportedOperationException("This operation is not supported in test mode");
    }
    
    public static String d(final String s) {
        return com.twitter.config.b.b(s, "unassigned");
    }
    
    public static boolean e(final String s) {
        final String a = a(s);
        return !"control".equals(a) && !"unassigned".equals(a);
    }
    
    public static boolean f(final String s) {
        return com.twitter.config.b.a(s, false);
    }
    
    public static String g(final String s) {
        return com.twitter.config.b.a(s, "");
    }
    
    public static ArrayList h(final String s) {
        return com.twitter.config.b.a(s, new ArrayList());
    }
    
    public static Object i(final String s) {
        return com.twitter.config.b.c(s);
    }
}
