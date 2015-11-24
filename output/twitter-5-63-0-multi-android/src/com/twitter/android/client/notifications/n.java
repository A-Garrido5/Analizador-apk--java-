// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.platform.c;
import com.twitter.library.platform.d;

public abstract class n extends l
{
    int b;
    private int h;
    
    public n(final d d, final String s, final long n) {
        super(d, s, n);
        this.b = 2;
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
    }
    
    @Override
    public boolean a() {
        return this.b().length >= this.b;
    }
    
    @Override
    protected boolean a(final c c) {
        return this.h == c.a;
    }
}
