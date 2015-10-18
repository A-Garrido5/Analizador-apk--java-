// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

public abstract class g extends z
{
    private final Context a;
    
    public g(final Context a) {
        this.a = a;
    }
    
    protected abstract void a(final long p0, final boolean p1, final int p2);
    
    @Override
    public void a(final y y) {
        final aa aa = (aa)y.l().b();
        final f f = (f)y;
        this.a(f.f(), aa.a(), f.g());
    }
}
