// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import android.util.Pair;
import com.twitter.internal.android.service.x;

class y extends ah
{
    final /* synthetic */ String a;
    final /* synthetic */ boolean e;
    final /* synthetic */ v f;
    
    y(final v f, final t t, final aj aj, final String a, final boolean e) {
        this.f = f;
        this.a = a;
        this.e = e;
        super(t, aj);
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        final Pair pair = (Pair)x.b();
        if (pair == null || this.isCancelled()) {
            return;
        }
        this.f.obtainMessage(2, (Object)new ae(this.a, (ResourceResponse$ResourceSource)pair.first, pair.second, this.e, null)).sendToTarget();
    }
}
