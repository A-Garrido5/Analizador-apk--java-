// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.content.Context;

public final class w
{
    private static x a;
    
    static {
        w.a = null;
    }
    
    public static x a(final Context context) {
        if (w.a == null) {
            return new y(context);
        }
        return w.a;
    }
}
