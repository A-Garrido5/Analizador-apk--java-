// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.network;

import com.twitter.internal.android.service.a;
import com.twitter.library.commerce.model.Profile;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

public class f extends z
{
    private final WeakReference a;
    private final boolean b;
    
    public f(final g g, final boolean b) {
        this.a = new WeakReference((T)g);
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        final g g = (g)this.a.get();
        if (g != null && !g.isFinishing() && y instanceof rw) {
            final aa aa = (aa)y.l().b();
            if (!aa.a()) {
                g.b(aa.c.getBundle("commerce_error_list_bundle"));
                return;
            }
            g.a(this.b, (Profile)aa.c.getSerializable("profile_bundle"));
        }
    }
}
