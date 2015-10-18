// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import android.content.Context;

public class j
{
    @TargetApi(17)
    public static final String a(final Context context) {
        return WebSettings.getDefaultUserAgent(context) + " " + "TwitterAndroid";
    }
    
    static final String a(String substring) {
        final int index = substring.indexOf(63);
        if (index > 0) {
            substring = substring.substring(0, index);
        }
        return substring;
    }
    
    public static final String b(final String s) {
        final String a = a(s);
        if (a.endsWith(".png") || a.endsWith(".jpg") || a.endsWith(".jpeg") || a.endsWith(".gif")) {
            return "image";
        }
        if (a.endsWith(".js")) {
            return "javascript";
        }
        if (a.endsWith(".css")) {
            return "css";
        }
        return "";
    }
}
