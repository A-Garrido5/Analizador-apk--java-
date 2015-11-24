// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.util.concurrent.ObservablePromise;

class x extends ObservablePromise
{
    final /* synthetic */ af a;
    final /* synthetic */ v b;
    
    x(final v b, final af a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    protected void a() {
        super.a();
        this.b.sendMessageAtFrontOfQueue(this.b.obtainMessage(4, (Object)this.a));
        this.b.removeMessages(1, (Object)this.a);
    }
}
