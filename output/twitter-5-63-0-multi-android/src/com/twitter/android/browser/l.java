// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import android.content.Context;
import android.util.LruCache;

public class l implements g
{
    private final LruCache a;
    private final LruCache b;
    private final LruCache c;
    private final Context d;
    private final q e;
    
    public l(final Context context, final int n) {
        this(context, n, new q());
    }
    
    public l(final Context d, final int n, final q e) {
        this.d = d;
        this.a = new LruCache(n);
        this.b = new LruCache(n);
        this.c = new LruCache(n);
        this.e = e;
    }
    
    @Override
    public void a(final String s) {
        if (s != null && this.a.get((Object)s) == null && this.b.get((Object)s) == null) {
            if (this.c.get((Object)s) != null) {
                this.c.remove((Object)s);
            }
            this.b.put((Object)s, (Object)s);
            this.e.a(new m(this), this.d, s).a();
        }
    }
    
    @Override
    public k b(final String s) {
        return (k)this.a.get((Object)s);
    }
    
    @Override
    public boolean c(final String s) {
        return s != null && (this.a.get((Object)s) != null || this.b.get((Object)s) != null || this.c.get((Object)s) != null);
    }
}
