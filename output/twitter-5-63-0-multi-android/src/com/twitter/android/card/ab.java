// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.m;
import android.support.v4.util.LruCache;

public class ab
{
    private LruCache a;
    private int b;
    
    public ab(final int b) {
        this.a = new LruCache(b);
        this.b = b;
    }
    
    public m a(final int n) {
        synchronized (this) {
            return (m)this.a.remove(n);
        }
    }
    
    public void a(final int n, final m m) {
        synchronized (this) {
            this.a.put(n, m);
        }
    }
}
