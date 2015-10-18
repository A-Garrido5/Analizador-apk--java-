// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.View;
import android.content.Intent;
import android.content.Context;

public abstract class af
{
    public final String e;
    public final long f;
    public final mx g;
    public final String h;
    public final String i;
    public int j;
    public boolean k;
    protected final int l;
    
    public af(final String e, final long f, final int l, final mx g, final boolean k, final String h, final String i) {
        this.e = e;
        this.f = f;
        this.l = l;
        this.g = g;
        this.k = k;
        this.h = h;
        this.i = i;
    }
    
    public abstract int a();
    
    public abstract Intent a(final Context p0);
    
    public abstract ag a(final View p0);
    
    public abstract String b();
    
    public boolean b(final int n) {
        return (n & this.l) == n;
    }
    
    public boolean f() {
        return this.l != 0;
    }
}
