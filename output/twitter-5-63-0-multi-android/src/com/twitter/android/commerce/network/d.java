// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.network;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

public class d extends z
{
    private final WeakReference a;
    
    public d(final e e) {
        this.a = new WeakReference((T)e);
    }
    
    @Override
    public void a(final y y) {
        final e e = (e)this.a.get();
        if (e != null && !e.isFinishing() && y instanceof rc) {
            final aa aa = (aa)y.l().b();
            if (!aa.a()) {
                e.a(aa.c.getBundle("commerce_error_list_bundle"));
                return;
            }
            e.a();
        }
    }
}
