// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import com.twitter.util.n;
import android.os.Parcel;
import com.twitter.util.m;

public abstract class HydratableMomentPage extends MomentPage
{
    private final m a;
    
    public HydratableMomentPage(final Parcel parcel) {
        super(parcel);
        this.a = new m();
    }
    
    public HydratableMomentPage(final boolean b) {
        super(b);
        this.a = new m();
    }
    
    public void a(final n n) {
        if (this.a()) {
            n.a(this);
            return;
        }
        this.a.a(n);
    }
    
    public abstract boolean a();
    
    public void b(final n n) {
        this.a.b(n);
    }
}
