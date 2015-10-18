// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import android.os.Build$VERSION;

abstract class c
{
    public static e a() {
        if (Build$VERSION.SDK_INT >= 16) {
            return f.a();
        }
        return g.a();
    }
}
