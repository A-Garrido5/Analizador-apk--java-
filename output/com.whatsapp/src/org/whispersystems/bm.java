// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

public class bm
{
    public static int a;
    
    private static String a(final Throwable t) {
        final int a = bm.a;
        if (t == null) {
            return "";
        }
        Throwable cause = t;
        while (cause != null) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
            cause = cause.getCause();
            if (a != 0) {
                break;
            }
        }
        final StringWriter stringWriter = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(stringWriter);
        t.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
    
    private static void a(final int n, final String s, final String s2) {
        final aQ a = aP.a();
        if (a != null) {
            a.a(n, s, s2);
        }
    }
    
    public static void a(final String s, final String s2) {
        a(5, s, s2);
    }
    
    public static void a(final String s, final Throwable t) {
        a(5, s, a(t));
    }
}
