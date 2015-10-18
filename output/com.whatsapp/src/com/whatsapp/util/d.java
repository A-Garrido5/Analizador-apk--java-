// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.InputStream;
import java.io.Closeable;

public final class d implements Closeable
{
    final n a;
    private final long b;
    private final InputStream[] c;
    private final String d;
    
    private d(final n a, final String d, final long b, final InputStream[] c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    d(final n n, final String s, final long n2, final InputStream[] array, final y y) {
        this(n, s, n2, array);
    }
    
    public InputStream a(final int n) {
        return this.c[n];
    }
    
    @Override
    public void close() {
        final boolean l = Log.l;
        final InputStream[] c = this.c;
        final int length = c.length;
        int i = 0;
        while (i < length) {
            n.a((Closeable)c[i]);
            ++i;
            if (l) {
                break;
            }
        }
    }
}
