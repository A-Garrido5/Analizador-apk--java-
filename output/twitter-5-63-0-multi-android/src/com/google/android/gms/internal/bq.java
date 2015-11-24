// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.api.Status;
import android.os.Looper;
import com.google.android.gms.common.api.n;
import com.google.android.gms.location.g;
import com.google.android.gms.location.LocationRequest;

class bq extends bs
{
    final /* synthetic */ LocationRequest b;
    final /* synthetic */ g c;
    final /* synthetic */ bp d;
    
    bq(final bp d, final n n, final LocationRequest b, final g c) {
        this.d = d;
        this.b = b;
        this.c = c;
        super(n);
    }
    
    protected void a(final cd cd) {
        cd.a(this.b, this.c, null);
        this.a((u)Status.a);
    }
}
