// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;

class aa extends az
{
    final /* synthetic */ int a;
    final /* synthetic */ long b;
    final /* synthetic */ y c;
    
    aa(final y c, final String s, final Object[] array, final int a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(s, array);
    }
    
    public void a() {
        try {
            this.c.h.a(this.a, this.b);
        }
        catch (IOException ex) {}
    }
}
