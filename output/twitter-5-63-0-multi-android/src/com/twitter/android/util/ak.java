// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.net.Uri$Builder;
import com.twitter.library.util.bn;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.net.Uri;
import android.content.Context;

public class ak
{
    private static final int[] a;
    
    static {
        a = new int[] { 2131298235, 2131298236 };
    }
    
    private static String a(final Context context, final String s) {
        final String substring = s.substring(context.getString(2131298234).length(), s.length());
        final int[] a = ak.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final String string = context.getString(a[i]);
            if (substring.equals("_" + string)) {
                return string;
            }
        }
        return "";
    }
    
    public static void a(final Context context, final Uri uri) {
        final String queryParameter = uri.getQueryParameter("refsrc");
        final String string = context.getString(2131298234);
        if (queryParameter != null && queryParameter.startsWith(string)) {
            c.a(context).a(az.a(context).b().g(), ScribeLog.a("login", "", "forgot_password", a(context, queryParameter), "success"));
        }
    }
    
    public static void a(final Context context, final String s, final int n) {
        final String string = context.getString(2131298234) + "_" + context.getString(n);
        final Uri$Builder appendQueryParameter = Uri.parse(context.getString(2131298233)).buildUpon().appendQueryParameter("refsrc", string);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            appendQueryParameter.appendQueryParameter("screen_name", s);
        }
        bn.b(context, appendQueryParameter.build());
        c.a(context).a(az.a(context).b().g(), ScribeLog.a("login", "", "forgot_password", a(context, string), "click"));
    }
}
