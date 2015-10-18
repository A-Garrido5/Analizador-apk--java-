// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import com.twitter.library.media.util.r;

public abstract class b implements r
{
    public final int a;
    protected final Context b;
    protected final m c;
    protected final c d;
    
    protected b(final Context b, final m c, final c d, final int a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public abstract void a();
    
    public abstract void a(final int p0);
    
    public abstract boolean a(final View p0, final MotionEvent p1);
    
    public abstract void b();
    
    public void b(final int n) {
    }
    
    public abstract void c();
    
    public boolean d() {
        return false;
    }
    
    @Override
    public void e() {
    }
    
    @Override
    public void f() {
    }
}
