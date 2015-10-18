// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.util.ArrayList;
import java.io.InputStream;

public class q extends InputStream
{
    private final ArrayList a;
    private InputStream b;
    private int c;
    
    public q(final ArrayList a) {
        this.a = a;
        this.c = 0;
    }
    
    @Override
    public void close() {
        if (this.b != null) {
            this.b.close();
            this.b = null;
        }
    }
    
    @Override
    public int read() {
        final byte[] array = { 0 };
        if (this.read(array, 0, 1) == 1) {
            return array[0];
        }
        return -1;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        final int c = this.c;
        InputStream b = this.b;
        int i = 0;
        int c2 = c;
        while (i < n2) {
            if (b == null) {
                b = ((n)this.a.get(c2)).a();
                this.b = b;
            }
            while (true) {
                final int read = b.read(array, n + i, n2 - i);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            if (i == n2 || c2 == -1 + this.a.size()) {
                break;
            }
            ++c2;
            this.c = c2;
            b.close();
            this.b = null;
            b = null;
        }
        return i;
    }
}
