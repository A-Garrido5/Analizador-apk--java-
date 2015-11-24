// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Bundle;
import android.content.Context;
import com.google.android.gms.common.a;
import android.support.v4.content.Loader;

class aj extends Loader implements p, q
{
    public final n a;
    private boolean b;
    private a c;
    
    public aj(final Context context, final n a) {
        super(context);
        this.a = a;
    }
    
    private void b(final a c) {
        this.c = c;
        if (this.isStarted() && !this.isAbandoned()) {
            this.deliverResult(c);
        }
    }
    
    public void a() {
        if (this.b) {
            this.b = false;
            if (this.isStarted() && !this.isAbandoned()) {
                this.a.b();
            }
        }
    }
    
    @Override
    public void a(final int n) {
    }
    
    @Override
    public void a(final Bundle bundle) {
        this.b = false;
        this.b(com.google.android.gms.common.a.a);
    }
    
    @Override
    public void a(final a a) {
        this.b = true;
        this.b(a);
    }
    
    @Override
    protected void onReset() {
        this.c = null;
        this.b = false;
        this.a.b((p)this);
        this.a.b((q)this);
        this.a.c();
    }
    
    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        this.a.a((p)this);
        this.a.a((q)this);
        if (this.c != null) {
            this.deliverResult(this.c);
        }
        if (!this.a.d() && !this.a.e() && !this.b) {
            this.a.b();
        }
    }
    
    @Override
    protected void onStopLoading() {
        this.a.c();
    }
}
