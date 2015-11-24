// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.internal.network.l;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.network.a;
import com.twitter.library.client.Session;
import android.content.Context;

class z extends s
{
    final /* synthetic */ r a;
    final /* synthetic */ r e;
    final /* synthetic */ String f;
    final /* synthetic */ v g;
    
    z(final v g, final Context context, final Session session, final String s, final com.twitter.library.network.a a, final com.twitter.library.media.manager.a a2, final ResourceRequestType resourceRequestType, final r a3, final r e, final String f) {
        this.g = g;
        this.a = a3;
        this.e = e;
        this.f = f;
        super(context, session, s, a, a2, resourceRequestType);
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        this.e.j();
        this.e.f();
        final aa aa = (aa)x.b();
        l f;
        if (aa != null) {
            f = aa.f();
        }
        else {
            f = null;
        }
        this.g.obtainMessage(3, (Object)new ad(this.f, f, null)).sendToTarget();
    }
    
    @Override
    protected boolean c(final aa aa) {
        this.a.j();
        this.a.f();
        this.e.i();
        return super.c(aa);
    }
}
