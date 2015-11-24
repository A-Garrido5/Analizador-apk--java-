// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.content.Context;

public final class ap
{
    private static al a;
    
    static {
        ap.a = null;
    }
    
    public static al a(final Context context) {
        if (ap.a == null) {
            return new aq(context);
        }
        return ap.a;
    }
}
