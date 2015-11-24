// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.text.BreakIterator;
import android.text.format.Formatter;
import android.support.annotation.NonNull;
import android.content.Context;

public class by
{
    private static final ThreadLocal a;
    
    static {
        a = new cd();
    }
    
    public static String a(@NonNull final Context context, final long n) {
        if (n < 0L) {
            return Formatter.formatShortFileSize(context, n);
        }
        if (n == 0L) {
            return context.getString(2131232145);
        }
        if (n < 1024L) {
            return context.getString(2131231388, new Object[] { n });
        }
        return Formatter.formatShortFileSize(context, n);
    }
    
    public static BreakIterator a() {
        return by.a.get();
    }
}
