// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.network;

import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

public class a extends z
{
    private final WeakReference a;
    
    public a(final b b) {
        this.a = new WeakReference((T)b);
    }
    
    @Override
    public void a(final y y) {
        final b b = (b)this.a.get();
        if (b != null && !b.isFinishing() && y instanceof qx) {
            final aa aa = (aa)y.l().b();
            if (!aa.a()) {
                b.a(aa.c.getBundle("commerce_error_list_bundle"));
                return;
            }
            b.a();
        }
    }
}
