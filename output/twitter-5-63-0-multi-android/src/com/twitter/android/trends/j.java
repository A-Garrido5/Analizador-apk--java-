// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import java.util.Locale;
import com.twitter.library.api.search.i;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.k;

public class j
{
    private static k a;
    
    static k a(final Context context, final Session session) {
        if (j.a == null) {
            return new k(context, session.e(), "trend_loc_prefs");
        }
        return j.a;
    }
    
    public static void a(final Context context, final Session session, final i i) {
        a(context, session).a().a("lang", i.f()).a("country", i.g()).apply();
    }
    
    public static boolean a(final Context context, final Session session, final Locale locale) {
        if (locale != null) {
            final k a = a(context, session);
            final String string = a.getString("lang", null);
            final String string2 = a.getString("country", null);
            if (string != null && string.equals(locale.getLanguage()) && string2 != null && string2.equals(locale.getCountry())) {
                return false;
            }
        }
        return true;
    }
}
