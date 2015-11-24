// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.zip.Inflater;

class p implements cd
{
    final /* synthetic */ bj a;
    final /* synthetic */ o b;
    
    p(final o b, final bj a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (this.b.b != 0) {
            final long b = this.a.b(bq, Math.min(n, this.b.b));
            if (b != -1L) {
                o.a(this.b, b);
                return b;
            }
        }
        return -1L;
    }
    
    @Override
    public void close() {
        this.a.close();
    }
}
