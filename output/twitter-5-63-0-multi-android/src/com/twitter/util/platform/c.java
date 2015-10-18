// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import android.util.Log;

class c implements m
{
    @Override
    public int a(final String s, final String s2) {
        return Log.w(s, s2);
    }
    
    @Override
    public int b(final String s, final String s2) {
        return Log.d(s, s2);
    }
}
