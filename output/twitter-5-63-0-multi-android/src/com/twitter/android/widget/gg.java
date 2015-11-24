// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.lang.ref.WeakReference;
import com.twitter.library.av.playback.v;

public class gg extends v
{
    WeakReference a;
    
    @Override
    public void a(final int n, final int n2) {
        super.a(n, n2);
        final gf gf = (gf)this.a.get();
        if (gf != null && n != 0 && n2 != 0) {
            gf.a(n / n2);
        }
    }
    
    public void a(final gf gf) {
        this.a = new WeakReference((T)gf);
    }
    
    @Override
    public void k() {
        super.k();
        final gf gf = (gf)this.a.get();
        if (gf != null) {
            bg.a().b(gf, 2);
        }
    }
}
