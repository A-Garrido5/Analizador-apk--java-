// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.content.Context;

public class n
{
    private static m a;
    
    static {
        n.a = null;
    }
    
    public static m a(final Context context) {
        if (n.a == null) {
            return new o(context);
        }
        return n.a;
    }
}
