// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import java.util.ArrayList;
import com.twitter.library.platform.c;
import com.twitter.library.platform.d;

public class e extends l
{
    private int b;
    private int h;
    private int[] i;
    private int[] j;
    private int k;
    
    public e(final d d, final String s, final long n, final int a, final int[] i, final int[] j, final int b) {
        super(d, s, n);
        this.h = -1;
        for (final c c : d.t) {
            if (c.b == d.p) {
                this.h = c.a;
                break;
            }
        }
        if (this.h == -1) {
            throw new IllegalStateException("Couldn't find notification id: " + d.p + " inside inbox");
        }
        this.b = b;
        this.a = a;
        this.i = i;
        this.j = j;
        this.k = -1;
    }
    
    public void a(final int k) {
        this.k = k;
    }
    
    @Override
    public boolean a() {
        return this.b().length >= this.b;
    }
    
    @Override
    protected boolean a(final c c) {
        if (m.b(c.a)) {
            if (this.i == null || this.i.length <= 0) {
                if (this.j != null && this.j.length > 0) {
                    final int[] j = this.j;
                    for (int length = j.length, i = 0; i < length; ++i) {
                        if (c.a == j[i]) {
                            return false;
                        }
                    }
                }
                return true;
            }
            final int[] k = this.i;
            for (int length2 = k.length, l = 0; l < length2; ++l) {
                if (c.a == k[l]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public c[] b() {
        int i = 0;
        final c[] b = super.b();
        if (this.k < 0 || b == null || b.length == 0) {
            return b;
        }
        final ArrayList<c> list = new ArrayList<c>();
        for (final c c : b) {
            if (c.a == this.k) {
                list.add(c);
            }
        }
        while (i < b.length) {
            final c c2 = b[i];
            if (c2.a != this.k) {
                list.add(c2);
            }
            ++i;
        }
        return list.toArray(com.twitter.library.platform.d.a);
    }
}
