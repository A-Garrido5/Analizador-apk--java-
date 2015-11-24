// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;
import android.os.Handler;
import com.twitter.library.av.model.b;

class k extends ay
{
    final /* synthetic */ b a;
    final /* synthetic */ Handler b;
    final /* synthetic */ f c;
    final /* synthetic */ j d;
    
    k(final j d, final b a, final Handler b, final f c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public Object a() {
        if (this.a != null && this.a.g() && j.a(this.d.a)) {
            return new e(this.b, this.c);
        }
        return new g(this.c);
    }
}
