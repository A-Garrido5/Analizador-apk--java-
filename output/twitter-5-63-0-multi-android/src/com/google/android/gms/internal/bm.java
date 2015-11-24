// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.p;
import android.os.Looper;
import android.content.Context;

public class bm extends o
{
    protected final cg d;
    private final String e;
    
    public bm(final Context context, final Looper looper, final p p5, final q q, final String e) {
        super(context, looper, p5, q, new String[0]);
        this.d = new bn(this);
        this.e = e;
    }
    
    @Override
    protected void a(final af af, final r r) {
        final Bundle bundle = new Bundle();
        bundle.putString("client_name", this.e);
        af.e(r, 6587000, this.g().getPackageName(), bundle);
    }
    
    protected bx c(final IBinder binder) {
        return by.a(binder);
    }
    
    @Override
    protected String d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
    
    @Override
    protected String e() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
}
