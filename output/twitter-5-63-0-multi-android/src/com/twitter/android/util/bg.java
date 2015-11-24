// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;

public class bg
{
    private static final List a;
    
    static {
        a = Arrays.asList("r", "f", "e");
    }
    
    public static long a(final Uri uri) {
        if (uri != null) {
            final String queryParameter = uri.getQueryParameter("c");
            if (queryParameter != null) {
                try {
                    return Long.parseLong(queryParameter);
                }
                catch (NumberFormatException ex) {
                    return -1L;
                }
            }
        }
        return -1L;
    }
    
    public static boolean a(final String s) {
        return bg.a.contains(s);
    }
    
    public static String b(final Uri uri) {
        if (uri != null) {
            return uri.getQueryParameter("v");
        }
        return null;
    }
}
