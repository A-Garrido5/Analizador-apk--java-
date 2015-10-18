// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.os.Looper;
import android.os.Handler;

public final class b extends by
{
    private final Handler a;
    
    public b(final ce ce) {
        super(ce);
        this.a = new Handler(Looper.getMainLooper());
    }
}
