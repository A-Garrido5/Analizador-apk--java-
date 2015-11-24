// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.lang.ref.WeakReference;
import com.twitter.library.av.playback.v;

public class n extends v
{
    private WeakReference a;
    
    public n() {
        this.a = new WeakReference(null);
    }
    
    public void a(final m m) {
        this.a = new WeakReference((T)m);
    }
    
    @Override
    public void k() {
        super.k();
        final m m = (m)this.a.get();
        if (m != null) {
            bg.a().b(m, 2);
        }
    }
}
