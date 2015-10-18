// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;

class z extends az
{
    final /* synthetic */ int a;
    final /* synthetic */ ErrorCode b;
    final /* synthetic */ y c;
    
    z(final y c, final String s, final Object[] array, final int a, final ErrorCode b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(s, array);
    }
    
    public void a() {
        try {
            this.c.b(this.a, this.b);
        }
        catch (IOException ex) {}
    }
}
