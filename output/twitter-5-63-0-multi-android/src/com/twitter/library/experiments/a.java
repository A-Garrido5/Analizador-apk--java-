// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.experiments;

import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.featureswitch.d;

public class a
{
    private static String a(final String s, final boolean b) {
        if (b) {
            return d.a(s);
        }
        return d.d(s);
    }
    
    public static String a(final boolean b, final Context context) {
        if (az.a(context).b().d()) {
            if (d.f("trends_plus_plus_enabled")) {
                return "trends_plus_plus_enabled";
            }
            if (!"unassigned".equals(d.d("trends_plus_plus_2968"))) {
                return a("trends_plus_plus_2968", b);
            }
        }
        return null;
    }
}
