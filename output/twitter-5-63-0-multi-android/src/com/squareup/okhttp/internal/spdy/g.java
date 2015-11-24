// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

final class g
{
    private final bq a;
    
    g(final bq a) {
        this.a = a;
    }
    
    void a(final int n, final int n2, final int n3) {
        if (n < n2) {
            this.a.c(n3 | n);
            return;
        }
        this.a.c(n3 | n2);
        int i;
        for (i = n - n2; i >= 128; i >>>= 7) {
            this.a.c((i & 0x7F) | 0x80);
        }
        this.a.c(i);
    }
    
    void a(final bk bk) {
        this.a(bk.e(), 127, 0);
        this.a.b(bk);
    }
    
    void a(final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final bk h = list.get(i).h;
            final Integer n = e.b.get(h);
            if (n != null) {
                this.a(1 + n, 63, 64);
                this.a(list.get(i).i);
            }
            else {
                this.a.c(64);
                this.a(h);
                this.a(list.get(i).i);
            }
        }
    }
}
