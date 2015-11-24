// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.provider.Tweet;
import java.lang.ref.WeakReference;
import com.twitter.android.qg;

final class ad implements qg
{
    private final WeakReference a;
    
    ad(final z z) {
        this.a = new WeakReference((T)z);
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final long n, final Tweet tweet, final boolean b) {
        final z z = (z)this.a.get();
        if (z != null) {
            if (!b) {
                z.a(true);
                z.a("retweet");
                return;
            }
            z.a(false);
            z.a("unretweet");
        }
    }
    
    @Override
    public void a(final long n, final boolean b, final boolean b2, final boolean b3) {
    }
    
    @Override
    public void b(final long n, final Tweet tweet, final boolean b) {
        final z z = (z)this.a.get();
        if (z != null && !b) {
            z.a("quote");
        }
    }
    
    @Override
    public void c(final long n, final Tweet tweet, final boolean b) {
    }
    
    @Override
    public void d(final long n, final Tweet tweet, final boolean b) {
    }
}
