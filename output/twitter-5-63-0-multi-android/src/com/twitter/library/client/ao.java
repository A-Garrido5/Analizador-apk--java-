// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.android.jv;
import java.lang.ref.WeakReference;

public class ao implements au
{
    private final WeakReference a;
    
    public ao(final jv jv) {
        this.a = new WeakReference((T)jv);
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
        final jv jv = (jv)this.a.get();
        if (jv != null && jv.h_()) {
            ((au)jv).a(n, bundle, y);
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        final jv jv = (jv)this.a.get();
        if (jv != null && jv.h_()) {
            ((au)jv).a(n, y);
        }
    }
    
    @Override
    public void b(final int n, final y y) {
        final jv jv = (jv)this.a.get();
        if (jv != null && jv.h_()) {
            ((au)jv).b(n, y);
        }
    }
}
