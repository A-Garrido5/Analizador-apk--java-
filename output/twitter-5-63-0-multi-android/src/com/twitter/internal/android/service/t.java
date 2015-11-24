// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import android.os.Binder;

public class t extends Binder
{
    final /* synthetic */ AsyncService a;
    
    public t(final AsyncService a) {
        this.a = a;
    }
    
    public AsyncService a() {
        return this.a;
    }
}
