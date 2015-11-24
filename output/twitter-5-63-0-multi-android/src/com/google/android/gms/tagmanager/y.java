// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class y
{
    static Map a;
    private static String b;
    
    static {
        y.a = new HashMap();
    }
    
    static String a(final String s, final String s2) {
        if (s2 != null) {
            return Uri.parse("http://hostname/?" + s).getQueryParameter(s2);
        }
        if (s.length() > 0) {
            return s;
        }
        return null;
    }
    
    static void a(final Context context, final String s) {
        bc.a(context, "gtm_install_referrer", "referrer", s);
        b(context, s);
    }
    
    static void a(final String b) {
        synchronized (y.class) {
            y.b = b;
        }
    }
    
    static void b(final Context context, final String s) {
        final String a = a(s, "conv");
        if (a != null && a.length() > 0) {
            y.a.put(a, s);
            bc.a(context, "gtm_click_referrers", a, s);
        }
    }
}
