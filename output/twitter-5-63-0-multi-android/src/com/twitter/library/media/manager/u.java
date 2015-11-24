// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.io.OutputStream;

class u implements g
{
    final /* synthetic */ aj a;
    final /* synthetic */ t b;
    
    u(final t b, final aj a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public boolean a(final Object o, final OutputStream outputStream) {
        return this.b.a(this.a, o, outputStream);
    }
}
