// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;

final class i implements cd
{
    int a;
    byte b;
    int c;
    int d;
    private final bj e;
    
    public i(final bj e) {
        this.e = e;
    }
    
    private void a() {
        final int c = this.c;
        final int i = this.e.i();
        final int j = this.e.i();
        final short n = (short)((0x3FFF0000 & i) >> 16);
        this.d = n;
        this.a = n;
        final byte b = (byte)((0xFF00 & i) >> 8);
        this.b = (byte)(i & 0xFF);
        this.c = (Integer.MAX_VALUE & j);
        if (b != 10) {
            throw d("%s != TYPE_CONTINUATION", new Object[] { b });
        }
        if (this.c != c) {
            throw d("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
    }
    
    @Override
    public long b(final bq bq, final long n) {
        while (this.d == 0) {
            if ((0x4 & this.b) != 0x0) {
                return -1L;
            }
            this.a();
        }
        final long b = this.e.b(bq, Math.min(n, this.d));
        if (b != -1L) {
            this.d -= (int)b;
            return b;
        }
        return -1L;
    }
    
    @Override
    public void close() {
    }
}
