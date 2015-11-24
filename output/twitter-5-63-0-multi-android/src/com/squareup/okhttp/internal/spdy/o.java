// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.zip.Inflater;

class o
{
    private final bp a;
    private int b;
    private final bj c;
    
    public o(final bj bj) {
        this.a = new bp(new p(this, bj), new q(this));
        this.c = bt.a(this.a);
    }
    
    private bk b() {
        return this.c.c(this.c.i());
    }
    
    private void c() {
        if (this.b > 0) {
            this.a.a();
            if (this.b != 0) {
                throw new IOException("compressedLimit > 0: " + this.b);
            }
        }
    }
    
    public List a(final int n) {
        this.b += n;
        final int i = this.c.i();
        if (i < 0) {
            throw new IOException("numberOfPairs < 0: " + i);
        }
        if (i > 1024) {
            throw new IOException("numberOfPairs > 1024: " + i);
        }
        final ArrayList list = new ArrayList<d>(i);
        for (int j = 0; j < i; ++j) {
            final bk d = this.b().d();
            final bk b = this.b();
            if (d.e() == 0) {
                throw new IOException("name.size == 0");
            }
            list.add(new d(d, b));
        }
        this.c();
        return list;
    }
    
    public void a() {
        this.c.close();
    }
}
