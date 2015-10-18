// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class cc
{
    private final boolean a;
    
    cc(final boolean a) {
        this.a = a;
    }
    
    public void a(final cs[] array) {
        if (!this.a || array == null || array.length < 3) {
            return;
        }
        final cs cs = array[0];
        array[0] = array[2];
        array[2] = cs;
    }
}
