// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.io.UnsupportedEncodingException;
import com.crashlytics.android.internal.cl;
import java.net.URLEncoder;

public class CrashlyticsMissingDependencyException extends RuntimeException
{
    private static final long serialVersionUID = -1151536370019872859L;
    
    CrashlyticsMissingDependencyException(final String s, final String s2) {
        super(a(s, s2));
    }
    
    private static String a(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        try {
            sb.append("\nThis app relies on Crashlytics. Configure your build environment here: \n");
            sb.append(String.format("https://crashlytics.com/register/%s/android/%s", URLEncoder.encode(s, "UTF-8"), URLEncoder.encode(s2, "UTF-8")) + "\n");
            return sb.toString();
        }
        catch (UnsupportedEncodingException ex) {
            cl.a().b().a("Crashlytics", "Could not find UTF-8 encoding.", ex);
            return sb.toString();
        }
    }
}
