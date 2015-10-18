// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.content.Context;

public final class c
{
    private static b a;
    
    public static b a(final Context context) {
        if (c.a != null) {
            return c.a;
        }
        return new d(context);
    }
}
