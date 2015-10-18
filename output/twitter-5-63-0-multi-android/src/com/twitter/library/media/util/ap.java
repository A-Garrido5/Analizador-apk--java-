// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.util.Log;

public class ap extends an
{
    private final String b;
    
    public ap(final String b) {
        this.b = b;
    }
    
    @Override
    public ao a(final String s) {
        Log.d(this.b, s);
        return this;
    }
}
