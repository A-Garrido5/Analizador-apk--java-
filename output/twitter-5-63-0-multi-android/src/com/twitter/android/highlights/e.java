// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.accounts.Account;
import com.twitter.library.client.as;
import com.twitter.library.provider.NotificationSetting;
import com.twitter.library.api.account.aa;
import com.twitter.library.client.az;
import com.twitter.library.util.a;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.m;
import com.twitter.android.MainActivity;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.android.client.c;
import android.content.Context;
import com.twitter.library.client.k;

public class e
{
    public static void a(final long n, final k k, final Context context, final c c, final String s) {
        boolean b;
        if (!b(k) && b(n, k)) {
            b = true;
        }
        else {
            b = false;
        }
        if (b && !a(n, k, true, false, context, c, s)) {
            ErrorReporter.a(new IllegalStateException("Session user account not found."));
        }
    }
    
    public static void a(final long n, final k k, final boolean b, final boolean b2, final c c, final String s) {
        MainActivity.e = true;
        final m a = k.a();
        a.a("pref_highlights_enabled", b);
        if (b2 && !k.getBoolean("pref_highlights_preserve_manual_setting", false)) {
            a.a("pref_highlights_preserve_manual_setting", true);
        }
        a.apply();
        c.a(n, s);
    }
    
    public static void a(final k k, final boolean b) {
        k.a().a("pref_highlights_intro_shown", b).apply();
    }
    
    public static boolean a(final long n) {
        return d.a(n, "homescreen_recs_enabled", false) && !d.a(n, "highlights_holdback_3157", new String[] { "control" });
    }
    
    public static boolean a(final long n, final k k) {
        return a(n) && (b(k) || b(n));
    }
    
    public static boolean a(final long n, final k k, final boolean b, final boolean b2, final Context context, final c c, final String s) {
        final Account a = com.twitter.library.util.a.a(context, n);
        if (a == null) {
            return false;
        }
        final aa aa = new aa(context, az.a(context).b(n));
        aa.c(4);
        final NotificationSetting q = NotificationSetting.q;
        int n2;
        if (b) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        aa.a(q, n2);
        aa.e = a;
        aa.h = true;
        aa.g = false;
        aa.a(new f(n, k, b, b2, c, s));
        as.a(context).a(aa);
        return true;
    }
    
    public static boolean a(final k k) {
        return k.getBoolean("pref_highlights_intro_shown", false);
    }
    
    public static boolean b(final long n) {
        return !d.a(n, "highlights_opt_out_3352", "unassigned", "control", "control_a");
    }
    
    static boolean b(final long n, final k k) {
        final boolean a = a(n);
        boolean b = false;
        if (a) {
            final boolean boolean1 = k.getBoolean("pref_highlights_preserve_manual_setting", false);
            b = false;
            if (!boolean1) {
                final boolean b2 = b(n);
                b = false;
                if (b2) {
                    b = true;
                }
            }
        }
        return b;
    }
    
    private static boolean b(final k k) {
        return k.getBoolean("pref_highlights_enabled", false);
    }
}
