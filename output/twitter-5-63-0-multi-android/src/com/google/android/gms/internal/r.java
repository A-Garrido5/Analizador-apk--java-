// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class r extends ad
{
    private o a;
    
    public r(final o a) {
        this.a = a;
    }
    
    public void a(final int n, final IBinder binder, final Bundle bundle) {
        ap.a((Object)"onPostInitComplete can be called only once per call to getServiceFromBroker", this.a);
        this.a.a(n, binder, bundle);
        this.a = null;
    }
}
