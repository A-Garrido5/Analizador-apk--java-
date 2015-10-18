// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import java.util.concurrent.FutureTask;

class p extends FutureTask implements Comparable
{
    public final int a;
    public final long b;
    
    public p(final q q, final Object o) {
        super(q, o);
        this.a = q.c;
        this.b = q.d;
    }
    
    public int a(final p p) {
        int n = this.a - p.a;
        if (n == 0) {
            n = (int)(this.b - p.b);
        }
        return n;
    }
}
